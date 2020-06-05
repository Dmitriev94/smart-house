package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int maxStation;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = 30;

    public Radio(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public Radio(int maxStation, int currentStation) {
        this.maxStation = maxStation;
        this.currentStation = currentStation;
    }


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


}
