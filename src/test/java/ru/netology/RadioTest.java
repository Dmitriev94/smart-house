package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextStation() {
        Radio radioV2 = new Radio(100, 0, 20, 100, 0, 30);

        radioV2.nextStation();

        assertEquals(21, radioV2.getCurrentStation());
    }

    @Test
    void nextStation2() {
        Radio radioV2 = new Radio(100, 0, 100, 100, 0, 30);

        radioV2.nextStation();

        assertEquals(radioV2.getMinStation(), radioV2.getCurrentStation());
    }

    @Test
    void previousStation() {
        Radio radioV2 = new Radio(120, 0, 65, 100, 0, 30);

        radioV2.previousStation();

        assertEquals(64, radioV2.getCurrentStation());
    }

    @Test
    void previousStation2() {
        Radio radioV2 = new Radio(120, 0, 0, 100, 0, 30);

        radioV2.previousStation();

        assertEquals(120, radioV2.getCurrentStation());
    }

    @Test
    void volumeUp() {
        Radio radioV2 = new Radio(100, 0, 20, 100, 0, 50);

        radioV2.volumeUp();

        assertEquals(51, radioV2.getCurrentVolume());

    }

    @Test
    void volumeUp2() {
        Radio radioV2 = new Radio(100, 0, 20, 100, 0, 100);

        radioV2.volumeUp();

        assertEquals(100, radioV2.getCurrentVolume());

    }

    @Test
    void volumeDown() {
        Radio radioV2 = new Radio(100, 0, 20, 100, 0, 50);

        radioV2.volumeDown();

        assertEquals(49, radioV2.getCurrentVolume());
    }

    @Test
    void volumeDown2() {
        Radio radioV2 = new Radio(100, 0, 20, 100, 0, 0);

        radioV2.volumeDown();

        assertEquals(0, radioV2.getCurrentVolume());
    }

    @Test
    void setCurrentStation() {
        Radio radioV2 = new Radio();

        radioV2.setCurrentStation(11);

        assertEquals(1, radioV2.getCurrentStation());
    }

    @Test
    void setCurrentStation2() {
        Radio radioV2 = new Radio();

        radioV2.setCurrentStation(-1);

        assertEquals(1, radioV2.getCurrentStation());
    }

    @Test
    void setCurrentStation3() {
        Radio radioV2 = new Radio();

        radioV2.setCurrentStation(7);

        assertEquals(7, radioV2.getCurrentStation());
    }

    @Test
    void setCurrentVolume() {
        Radio radioV2 = new Radio();

        radioV2.setCurrentVolume(101);

        assertEquals(30, radioV2.getCurrentVolume());
    }

    @Test
    void setCurrentVolume2() {
        Radio radioV2 = new Radio();

        radioV2.setCurrentVolume(-1);

        assertEquals(30, radioV2.getCurrentVolume());
    }

    @Test
    void setCurrentVolume3() {
        Radio radioV2 = new Radio();

        radioV2.setCurrentVolume(50);

        assertEquals(50, radioV2.getCurrentVolume());
    }


}