package model;

public class Duration {
    public int minutes;
    public int seconds;

    public Duration(int minute, int seconds) {
        if (!verifyDuration()){
            this.minutes = minute;
            this.seconds = seconds;
        }else if (verifyDuration()){
            throw new IllegalArgumentException("Invalid date");
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public boolean verifyDuration(){
        return minutes < 0 || seconds < 0;
    }

    @Override
    public String toString(){
        return minutes + ":" + seconds;
    }

}
