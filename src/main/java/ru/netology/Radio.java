package ru.netology;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Radio {
    private int maxStation = 10;
    private int minStation = 0;
    private int currentStation = 1;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = 30;

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }

        currentStation++;
    }

    public void previousStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }

        currentStation--;
    }

    public void volumeUp() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void volumeDown() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

}
