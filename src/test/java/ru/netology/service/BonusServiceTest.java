package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BonusServiceTest {

    @Test
    public void shouldReturn10IfAmount2000() {

        BonusService bonusService = new BonusService();
        int amount = 2000;

        int actual = bonusService.calculateBonus(amount);
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn100IfAmount30000() {
        BonusService bonusService = new BonusService();
        int amount = 30000;

        int actual = bonusService.calculateBonus(amount);
        int expected = 100;

        assertEquals(actual, expected);

    }


    @Test
    public void shouldReturn0IfAmount900() {
        BonusService bonusService = new BonusService();
        int amount = 900;

        int actual = bonusService.calculateBonus(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturn0IfAmount1000() {
        BonusService bonusService = new BonusService();
        int amount = 0;

        int actual = bonusService.calculateBonus(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturn13fAmount2300() {
        BonusService bonusService = new BonusService();
        int amount = 2300;

        int actual = bonusService.calculateBonus(amount);
        int expected = 13;

        assertEquals(actual, expected);

    }
}