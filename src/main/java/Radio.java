public class Radio {
    private int currentStation;
    private int currentVolume;


    public int getCurrentStation() {
        return currentStation;
    }

    public int setCurrentStation(int currentStation) {
        if (currentStation >=0 & currentStation <=9) {
            this.currentStation = currentStation;
        }
        else {
            this.currentStation = 0;
        }
        return this.currentStation;
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        }
        else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        }
        else {
            currentStation --;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 & currentVolume <= 10) {
            this.currentVolume = currentVolume;
        }
        else {
            this.currentVolume = 10;
        }
    }



    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;

        }
    }

    public void downVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}