package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackerApiTest {

    @Test
    public void testRemain() {
        CashbackHacker cashback = new CashbackHacker();

        int amount = 900;
        int actual = cashback.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainWithOneHundred() {
        CashbackHacker cashback = new CashbackHacker();

        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainWithBorderValuesMore() {
        CashbackHacker cashback = new CashbackHacker();

        int amount = 1001;
        int actual = cashback.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainWithBorderValuesLess() {
        CashbackHacker cashback = new CashbackHacker();

        int amount = 999;
        int actual = cashback.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainWithZero() {
        CashbackHacker cashback = new CashbackHacker();

        int amount = 0;
        int actual = cashback.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }
}