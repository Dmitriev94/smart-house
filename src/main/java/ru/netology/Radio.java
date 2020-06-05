package ru.netology;

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

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

   // public void setCurrentStation(int currentStation) {
  //      if (currentStation > maxStation) {
   //         return;
   //     }
   //     if (currentStation < minStation) {
   //         return;
   //     }
   //     this.currentStation = currentStation;
   // }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

   // public void setCurrentVolume(int currentVolume) {
  //      if (currentVolume > maxVolume) {
  //          return;
   //     }
   //     if (currentVolume < minVolume) {
   //         return;
    //    }
    //    this.currentVolume = currentVolume;
   // }
}
