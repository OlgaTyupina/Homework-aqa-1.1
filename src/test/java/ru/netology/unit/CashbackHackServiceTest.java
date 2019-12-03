package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

@Test
void cashbackNotChargedPayAddition() {
        CashbackHackService cashback = new CashbackHackService();
         int amount = 900;
         int  payInAddition = boundary - amount;

         int actual = cashback.remain(amount);
         String expected = "Вам нужно докупить на " + payInAddition;

         assertEquals(expected, actual);
    }

@Test
void cashbackChargedFrom1000() {
        CashbackHackService cashback1000 = new CashbackHackService();
        int amount = 1000;

        int actual = cashback1000.remain(amount);
        String expected = "Вам начислен кэшбэк" ;

        assertEquals(expected, actual);
    }
    



}
