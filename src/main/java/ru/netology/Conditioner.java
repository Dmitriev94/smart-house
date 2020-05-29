package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature = 35;
    private int minTemperature = 12;
    private int currentTemperature = 20;
    private boolean on;

    public void increaseCurrentTemperature() {
        if (currentTemperature == maxTemperature) {
            return;
        }
        currentTemperature++;

    }


    public void decreaseCurrentTemperature() {
        if (currentTemperature == minTemperature) {
            return;
        }
        currentTemperature--;

    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }
}




