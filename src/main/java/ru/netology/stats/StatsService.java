package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long sumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSale += sales[i];
        }
        return sumSale;
    }

    public long averageSum(long[] sales) {
        long sumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSale += sales[i];
        }
        long averageSale = sumSale / 12;
        return averageSale;
    }

    public int monthMaxSale(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;

            }
        }
        return monthMax + 1;
    }

    public int monthMinSale(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;

            }
        }
        return monthMin + 1;
    }

    public int belowAverageSale(long[] sales) {
        int counter = 0;
        long averageSale = averageSum(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveAverageSale(long[] sales) {
        int counter = 0;
        long averageSale = averageSum(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale) {
                counter++;
            }
        }
        return counter;
    }

}
