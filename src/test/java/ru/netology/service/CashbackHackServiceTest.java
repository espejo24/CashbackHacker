package ru.netology.service;

import junit.framework.TestCase;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldCalculateRemainWhenAmount1500() {
        int expected = 500;
        int actual = service.remain(1500);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateRemainWhenAmount999() {
        int expected = 1;
        int actual = service.remain(999);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateRemainWhenAmount1001() {
        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateRemainWhenAmount1000() {  // баг (не должен напоминать (т.е. 0),
        int expected = 0;                             // а предлагает докупить на еще 1000
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }
}

