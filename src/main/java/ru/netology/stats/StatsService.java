package ru.netology.stats;

public class StatsService {

    public int sum(int[] Array) {
        int result = 0;


        for (int amount : Array) {
            result += amount;
        }
        return result;
    }

    public int average(int[] array) {
        return sum(array) / array.length;
    }

    public int getMaxMonth(int[] array) {
        int max = getMax(array);

        int result = 0;
        int month = 1;
        for (int amount : array) {
            if (amount == max) {
                result = month;
            }
            month++;

        }
        return result;

    }

    public int getMax(int[] array) {
        int max = 0;

        for (int amount : array) {
            if (amount > max) {
                max = amount;
            }
        }
        return max;
    }

    public int getMinMonth(int[] array) {
        int min = getMin(array);

        int result = 0;
        int month = 1;
        for (int amount : array) {
            if (amount == min) {
                result = month;
            }
            month++;

        }
        return result;

    }

    public int getMin(int[] array) {
        int min = array[0];

        for (int amount : array) {
            if (amount < min) {
                min = amount;
            }
        }
        return min;
    }

    public int getMonthCountMoreThanAverage(int[] array) {
        int average = average(array);
        int count = 0;
        for (int amount : array) {
            if (amount > average) {
                count++;
            }

        }
        return count;

    }

    public int getMonthCountLessThanAverage(int[] array) {
        int average = average(array);
        int count = 0;
        for (int amount : array) {
            if (amount < average) {
                count++;
            }
        }

        return count;
    }
}
