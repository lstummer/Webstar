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
        assertEquals("now", durationFormat.formatDuration(0));
    }

    @Test
    void test_formatDuration_1_1Second() {
        System.out.println(durationFormat.formatDuration(1));
        assertEquals("1 second", durationFormat.formatDuration(1));
    }

    @Test
    void test_formatDuration_2_2Seconds() {
        System.out.println(durationFormat.formatDuration(2));
        assertEquals("2 seconds", durationFormat.formatDuration(2));
    }

    @Test
    void test_formatDuration_59_59Seconds() {
        System.out.println(durationFormat.formatDuration(59));
        assertEquals("59 seconds", durationFormat.formatDuration(59));
    }

    @Test
    void test_formatDuration_60_1Minute() {
        System.out.println(durationFormat.formatDuration(60));
        assertEquals("1 minute", durationFormat.formatDuration(60));
    }

    @Test
    void test_formatDuration_62_1MinuteAnd2Seconds() {
        System.out.println(durationFormat.formatDuration(62));
        assertEquals("1 minute and 2 seconds", durationFormat.formatDuration(62));
    }

    @Test
    void test_formatDuration_120_2Minutes() {
        System.out.println(durationFormat.formatDuration(120));
        assertEquals("2 minutes", durationFormat.formatDuration(120));
    }

    @Test
    void test_formatDuration_179_2MinutesAnd59Seconds() {
        System.out.println(durationFormat.formatDuration(179));
        assertEquals("2 minutes and 59 seconds", durationFormat.formatDuration(179));
    }

    @Test
    void test_formatDuration_180_3Minutes() {
        System.out.println(durationFormat.formatDuration(180));
        assertEquals("3 minutes", durationFormat.formatDuration(180));
    }

    @Test
    void test_formatDuration_181_3MinutesAnd1Second() {
        System.out.println(durationFormat.formatDuration(181));
        assertEquals("3 minutes and 1 second", durationFormat.formatDuration(181));
    }

    @Test
    void test_formatDuration_3600_1Hour() {
        System.out.println(durationFormat.formatDuration(3600));
        assertEquals("1 hour", durationFormat.formatDuration(3600));
    }

    @Test
    void test_formatDuration_7200_2Hours() {
        System.out.println(durationFormat.formatDuration(7200));
        assertEquals("2 hours", durationFormat.formatDuration(7200));
    }

    @Test
    void test_formatDuration_3662_1Hour1MinuteAnd2Seconds() {
        System.out.println(durationFormat.formatDuration(3662));
        assertEquals("1 hour, 1 minute and 2 seconds", durationFormat.formatDuration(3662));
    }

    @Test
    void test_formatDuration_86400_1Day() {
        System.out.println(durationFormat.formatDuration(86400));
        assertEquals("1 day", durationFormat.formatDuration(86400));
    }

    @Test
    void test_formatDuration_172800_2Days() {
        System.out.println(durationFormat.formatDuration(172800));
        assertEquals("2 days", durationFormat.formatDuration(172800));
    }

    @Test
    void test_formatDuration_90061_1Day1Hour1MinuteAnd1Second() {
        System.out.println(durationFormat.formatDuration(90061));
        assertEquals("1 day, 1 hour, 1 minute and 1 second", durationFormat.formatDuration(90061));
    }

    @Test
    void test_formatDuration_172900_2Days1MinuteAnd40Seconds() {
        System.out.println(durationFormat.formatDuration(172900));
        assertEquals("2 days, 1 minute and 40 seconds", durationFormat.formatDuration(172900));
    }

    @Test
    void test_formatDuration_31626061_1Year1Day1Hour1MinuteAnd1Second() {
        System.out.println(durationFormat.formatDuration(31626061));
        assertEquals("1 year, 1 day, 1 hour, 1 minute and 1 second", durationFormat.formatDuration(31626061));
    }

    @Test
    void test_formatDuration_63252122_2Years2Days2Hours2MinutesAnd2Seconds() {
        System.out.println(durationFormat.formatDuration(63252122));
        assertEquals("2 years, 2 days, 2 hours, 2 minutes and 2 seconds", durationFormat.formatDuration(63252122));
    }

// TESTS FROM WEBSTAR

    @Test
    void test_formatDuration_3601_1HourAnd1Second() {
        System.out.println(durationFormat.formatDuration(3601));
        assertEquals("1 hour and 1 second", durationFormat.formatDuration(3601));
    }

    @Test
    void test_formatDuration_3602_1HourAnd2Seconds() {
        System.out.println(durationFormat.formatDuration(3602));
        assertEquals("1 hour and 2 seconds", durationFormat.formatDuration(3602));
    }

    @Test
    void test_formatDuration_95904001_3Years15DaysAnd1Second() {
        System.out.println(durationFormat.formatDuration(95904001));
        assertEquals("3 years, 15 days and 1 second", durationFormat.formatDuration(95904001));
    }

    @Test
    void test_formatDuration_31536001_1YearAnd1Second() {
        System.out.println(durationFormat.formatDuration(31536001));
        assertEquals("1 year and 1 second", durationFormat.formatDuration(31536001));
    }

    @Test
    void test_formatDuration_90001_1Day1HourAnd1Second() {
        System.out.println(durationFormat.formatDuration(90001));
        assertEquals("1 day, 1 hour and 1 second", durationFormat.formatDuration(90001));
    }
}
