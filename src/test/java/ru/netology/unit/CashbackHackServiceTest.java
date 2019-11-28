package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void cashbackNotChargedPayAddition() {
        CashbackHackService cashback = new CashbackHackService();
         int amount = 900;

         int actual = cashback.remain(amount);
         int expected = 0;

         assertEquals(expected, actual);
    }

    @Test
    void cashbackCahrgedFrom1000() {
        CashbackHackService cashback1000 = new CashbackHackService();
        int amount = 1000;

        int actual = cashback1000.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }


}