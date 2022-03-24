package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldCalculateRemainWhenAmount1500() {
        int actual = service.remain(1500);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateRemainWhenAmount900() {
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateRemainWhenAmount999() {
        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateRemainWhenAmount1001() {
        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateRemainWhenAmount1000() {   // баг (не должен напоминать (т.е. 0),
        int actual = service.remain(1000);        // а предлагает докупить на еще 1000
        int expected = 0;

        assertEquals(actual, expected);
    }
}

