package hu.webstar.humanreadabledurationformat;

import java.util.ArrayList;
import java.util.List;

public class DurationFormat {

    private int seconds;

    public String formatDuration(int seconds) {

        final String[] TIME_COMPONENTS = {"year", "day", "hour", "minute", "second"};
        final String[] TIME_COMPONENTS_PLURAL = {"years", "days", "hours", "minutes", "seconds"};

        String strResult = "";
        List<Integer> listComponents = new ArrayList<>();
        int lastIndex;
        int i;

        if (seconds < 0) {
            throw new IllegalArgumentException("Parameter can't be smaller than zero!");
        }

        if (seconds == 0) {
            return "now";
        }

        this.seconds = seconds;

        listComponents.add(getYear());
        listComponents.add(getDay());
        listComponents.add(getHour());
        listComponents.add(getMinute());
        listComponents.add(getSecond());

        lastIndex = listComponents.size() - 1;
        if (listComponents.get(lastIndex) == 0) {
            lastIndex = listComponents.lastIndexOf(0) - 1;
        }

        i = 0;
        while (i < lastIndex) {
            if (listComponents.get(i) > 0) {
                strResult += listComponents.get(i) + " ";
                if (listComponents.get(i) > 1) {
                    strResult += TIME_COMPONENTS_PLURAL[i];
                } else {
                    strResult += TIME_COMPONENTS[i];
                }
                if (i < lastIndex - 1) {
                    strResult += ", ";
                }
            }
            i++;
        }
        if (!strResult.isEmpty()) {
            strResult += " and ";
        }
        strResult += listComponents.get(i) + " ";
        if (listComponents.get(i) > 1) {
            strResult += TIME_COMPONENTS_PLURAL[i];
        } else {
            strResult += TIME_COMPONENTS[i];
        }

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
