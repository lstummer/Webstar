package hu.webstar.humanreadabledurationformat;

public class DurationFormat {

    private int seconds;

    public String formatDuration(int seconds) {
        String strResult = null;

        if (seconds < 0) {
            throw new IllegalArgumentException("Parameter can't be smaller than zero!");
        }

        if (seconds == 0) {
            return "now";
        }

        this.seconds = seconds;

        return strResult;
    }

    public int getYear() {
        return seconds / 31536000;
    }

    public int getDay() {
        return (seconds % 31536000) / 86400;
    }

    public int getHour() {
        return (seconds % 86400) / 3600;
    }

    public int getMinute() {
        return (seconds % 3600) / 60;
    }

    public int getSecond() {
        return seconds % 60;
    }
}
