package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {




    @Test
    void nextStation() {
        Radio radioV2 = new Radio(120,65);

        radioV2.nextStation();

        assertEquals(66,  radioV2.getCurrentStation());
    }

    @Test
    void nextStation2() {
        Radio radioV2 = new Radio(120,120);

        radioV2.nextStation();

        assertEquals(radioV2.getMinStation(), radioV2.getCurrentStation());
    }

    @Test
    void previousStation() {
        Radio radioV2 = new Radio(120,65);

        radioV2.previousStation();

        assertEquals(64, radioV2.getCurrentStation());
    }

    @Test
    void previousStation2() {
        Radio radioV2 = new Radio(120,0);

        radioV2.previousStation();

        assertEquals(120, radioV2.getCurrentStation());
    }

    @Test
    void volumeUp() {
        Radio radioV2 = new Radio(50);

        radioV2.volumeUp();

        assertEquals(51, radioV2.getCurrentVolume());

    }

    @Test
    void volumeUp2() {
        Radio radioV2 = new Radio(100);

        radioV2.volumeUp();

        assertEquals(100, radioV2.getCurrentVolume());

    }

    @Test
    void volumeDown() {
        Radio radioV2 = new Radio(50);

        radioV2.volumeDown();

        assertEquals(49, radioV2.getCurrentVolume());
    }

    @Test
    void volumeDown2() {
        Radio radioV2 = new Radio(0);

        radioV2.volumeDown();

        assertEquals(0, radioV2.getCurrentVolume());
    }


}