package hu.webstar.humanreadabledurationformat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DurationFormatTest {

    DurationFormat durationFormat = new DurationFormat();

    @Test
    void test_formatDuration_negative_illegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> durationFormat.formatDuration(-1));
    }

    @Test
    void test_formatDuration_62_1MinuteAnd2Seconds() {
        assertEquals("now",durationFormat.formatDuration(0));
    }

    @Test
    void test_formatDuration_62_1MinuteAnd2Seconds() {
        assertEquals("1 minute and 2 seconds",durationFormat.formatDuration(62));
    }

    @Test
    void test_formatDuration_3662_1Hour1MinuteAnd2Seconds() {
        assertEquals("1 hour, 1 minute and 2 seconds",durationFormat.formatDuration(3662));
    }
}
