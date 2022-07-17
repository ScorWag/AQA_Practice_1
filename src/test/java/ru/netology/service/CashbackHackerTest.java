package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {

    @Test
    public void testRemain() {
        CashbackHacker cashback = new CashbackHacker();

        int amount = 900;
        int actual = cashback.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWithOneHundred() {
        CashbackHacker cashback = new CashbackHacker();

        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWithBorderValuesMore() {
        CashbackHacker cashback = new CashbackHacker();

        int amount = 1001;
        int actual = cashback.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWithBorderValuesLess() {
        CashbackHacker cashback = new CashbackHacker();

        int amount = 999;
        int actual = cashback.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWithZero() {
        CashbackHacker cashback = new CashbackHacker();

        int amount = 0;
        int actual = cashback.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

}