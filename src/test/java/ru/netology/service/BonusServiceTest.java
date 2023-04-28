package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
public class BonusServiceTest {

    @Test
    public void shouldReturn1IfAmount1000() {
        BonusService bonusService = new BonusService();
        int amount = 1000;

        int expected = 1;
        int actual = bonusService.calculateBonus(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturn20IfAmount3000() {
        BonusService bonusService = new BonusService();
        int amount = 3000;

        int expected = 20;
        int actual = bonusService.calculateBonus(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturn100IfAmount30000() {
        BonusService bonusService = new BonusService();
        int amount = 30000;

        int expected = 100;
        int actual = bonusService.calculateBonus(amount);

        assertEquals(expected, actual);

    }
}