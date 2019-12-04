package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturn100IfAmount900() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 900;

        int actual = cashback.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn0IfAmount1000() {
        CashbackHackService cashback1000 = new CashbackHackService();
        int amount = 1000;

        int actual = cashback1000.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn1000IfAmount0() {
        CashbackHackService cashback0 = new CashbackHackService();
        int amount = 0;

        int actual = cashback0.remain(amount);
        int expected = 1000;
        
        assertEquals(expected, actual);
    }
}
