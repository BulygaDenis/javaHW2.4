package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    private StatsService service = new StatsService();
    private int[] expectedArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
    void shouldSum() {
        int expected = 180;
        int actual = service.sum(expectedArray);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAverage() {
        assertEquals(15, service.average(expectedArray));
    }

    @Test
    void shouldGetMaxMonth() {
        int expected = 8;
        int actual = service.getMaxMonth(expectedArray);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetMinMonth() {
        int expected = 9;
        int actual = service.getMinMonth(expectedArray);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetCountMoreThanAverage() {
        int expected = 5;
        int actual = service.getMonthCountMoreThanAverage(expectedArray);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetCountLessThanAverage() {
        int expected = 5;
        int actual = service.getMonthCountLessThanAverage(expectedArray);
        assertEquals(expected, actual);
    }
}