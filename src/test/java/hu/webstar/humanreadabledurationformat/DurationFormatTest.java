package hu.webstar.humanreadabledurationformat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DurationFormatTest {

    DurationFormat durationFormat = new DurationFormat();

    @Test
    void test_formatDuration_negative_illegalArgumentException() {
//        System.out.println(durationFormat.formatDuration(-1));
        assertThrows(IllegalArgumentException.class, () -> durationFormat.formatDuration(-1));
    }

    @Test
    void test_formatDuration_0_now() {
        System.out.println(durationFormat.formatDuration(0));
        assertEquals("now",durationFormat.formatDuration(0));
    }

    @Test
    void test_formatDuration_1_1Second() {
        System.out.println(durationFormat.formatDuration(1));
        assertEquals("1 second",durationFormat.formatDuration(1));
    }

    @Test
    void test_formatDuration_2_2Seconds() {
        System.out.println(durationFormat.formatDuration(2));
        assertEquals("2 seconds",durationFormat.formatDuration(2));
    }

    @Test
    void test_formatDuration_59_59Seconds() {
        System.out.println(durationFormat.formatDuration(59));
        assertEquals("59 seconds",durationFormat.formatDuration(59));
    }

    @Test
    void test_formatDuration_60_1Minute() {
        System.out.println(durationFormat.formatDuration(60));
        assertEquals("1 minute",durationFormat.formatDuration(60));
    }

    @Test
    void test_formatDuration_62_1MinuteAnd2Seconds() {
        System.out.println(durationFormat.formatDuration(62));
        assertEquals("1 minute and 2 seconds",durationFormat.formatDuration(62));
    }

    @Test
    void test_formatDuration_120_2Minutes() {
        System.out.println(durationFormat.formatDuration(120));
        assertEquals("2 minutes",durationFormat.formatDuration(120));
    }

    @Test
    void test_formatDuration_179_2MinutesAnd59Seconds() {
        System.out.println(durationFormat.formatDuration(179));
        assertEquals("2 minutes and 59 seconds",durationFormat.formatDuration(179));
    }

    @Test
    void test_formatDuration_180_3Minutes() {
        System.out.println(durationFormat.formatDuration(180));
        assertEquals("3 minutes",durationFormat.formatDuration(180));
    }

    @Test
    void test_formatDuration_181_3MinutesAnd1Second() {
        System.out.println(durationFormat.formatDuration(181));
        assertEquals("3 minutes and 1 second",durationFormat.formatDuration(181));
    }

    @Test
    void test_formatDuration_3600_1Hour() {
        System.out.println(durationFormat.formatDuration(3600));
        assertEquals("1 hour",durationFormat.formatDuration(3600));
    }

    @Test
    void test_formatDuration_3662_1Hour1MinuteAnd2Seconds() {
        System.out.println(durationFormat.formatDuration(3662));
        assertEquals("1 hour, 1 minute and 2 seconds",durationFormat.formatDuration(3662));
    }

    @Test
    void test_formatDuration_86400_1Day() {
        System.out.println(durationFormat.formatDuration(86400));
        assertEquals("1 day",durationFormat.formatDuration(86400));
    }

    @Test
    void test_formatDuration_90061_1Day1Hour1MinuteAnd1Second() {
        System.out.println(durationFormat.formatDuration(90061));
        assertEquals("1 day, 1 hour, 1 minute and 1 second",durationFormat.formatDuration(90061));
    }
}
