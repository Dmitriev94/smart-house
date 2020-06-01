package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.setMaxTemperature(35);
        conditioner.increaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        int expected = 21;
        assertEquals(expected, actual);
    }

    @Test
    void increaseCurrentTemperature2() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(35);
        conditioner.setMaxTemperature(35);
        conditioner.increaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        int expected = 35;
        assertEquals(expected, actual);
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.setMinTemperature(12);
        conditioner.decreaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        int expected = 19;
        assertEquals(expected, actual);
    }

    @Test
    void decreaseCurrentTemperature2() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(12);
        conditioner.setMinTemperature(12);
        conditioner.decreaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(36);
        conditioner.setMaxTemperature(35);
        int actual = conditioner.getCurrentTemperature();
        int expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentTemperature2() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(4);
        conditioner.setMinTemperature(10);
        int actual = conditioner.getCurrentTemperature();
        int expected = 20;
        assertEquals(expected, actual);
    }
}