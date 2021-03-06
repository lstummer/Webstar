package hu.webstar.humanreadabledurationformat;

import java.util.ArrayList;
import java.util.List;

public class DurationFormat {

    private final String[] TIME_UNITS = {"year", "day", "hour", "minute", "second"};
    private final String[] TIME_UNITS_PLURAL = {"years", "days", "hours", "minutes", "seconds"};

    private int seconds;

    public String formatDuration(int seconds) {

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
                strResult += listComponents.get(i) + " " + getTimeUnit(listComponents.get(i), i);
                if (i < indexOfLastNonZeroTimeUnit - 1) {
                    strResult += ", ";
                }
            }
            i++;
        }

// Concatenating the last (non zero) item of time units.
        if (!strResult.isEmpty()) {
            if (", ".equals(strResult.substring(strResult.length() - 2))) {
                strResult = strResult.substring(0, strResult.length() - 2);
            }
            strResult += " and ";
        }
        strResult += listComponents.get(i) + " " + getTimeUnit(listComponents.get(i), i);

        return strResult;
    }

    private String getTimeUnit(int componentNumber, int i) {

        return componentNumber > 1 ? TIME_UNITS_PLURAL[i] : TIME_UNITS[i];
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
