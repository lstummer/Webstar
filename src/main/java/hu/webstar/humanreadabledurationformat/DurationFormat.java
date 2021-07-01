package hu.webstar.humanreadabledurationformat;

public class DurationFormat {

    public String formatDuration(int seconds) {
        String strResult=null;

        if (seconds < 0) {
            throw new IllegalArgumentException("Parameter can't be smaller than zero!");
        }

        if (seconds == 0) {
            return "now";
        }

        return strResult;
    }
}
