package ru.netology;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = 5;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = 5;

    public void nextStation (){
        if (currentStation == maxStation){
            currentStation = minStation;
        }
        else
        currentStation++;
    }
    public void previousStation (){
        if (currentStation == minStation){
            currentStation = maxStation;
        }
        else
        currentStation--;
    }
    public void volumeUp (){
        if (currentVolume == maxVolume){
            return;
        }
        currentVolume++;
    }
    public void volumeDown (){
        if (currentVolume == minVolume){
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

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

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

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}