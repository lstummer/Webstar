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
        int indexOfLastNonZeroTimeUnit;
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

// Search the last non zero item of the list of time units.
        i = listComponents.size() - 1;
        while (listComponents.get(i) == 0) {
            i--;
        }
        indexOfLastNonZeroTimeUnit = i;

// Concatenating non zero items of time units until the item before the last non zero item.
        i = 0;
        while (i < indexOfLastNonZeroTimeUnit) {
            if (listComponents.get(i) > 0) {
                strResult += listComponents.get(i) + " ";
                if (listComponents.get(i) > 1) {
                    strResult += TIME_COMPONENTS_PLURAL[i];
                } else {
                    strResult += TIME_COMPONENTS[i];
                }
                if (i < indexOfLastNonZeroTimeUnit - 1) {
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
