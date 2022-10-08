package ru.netology.javaqa.statistics.services;

public class StatsService {

    public long salesAmount(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount += sale;
        }
        return amount;
    }

    public long averageAmountSalesMonth(long[] sales) {
        long averageAmount = 0;
        int month = sales.length;
        long amount = salesAmount(sales);
        averageAmount = amount / month;
        return averageAmount;
    }

    public long maxMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long minMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsSalesBelowAverage(long[] sales) {
        long average = averageAmountSalesMonth(sales);
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale < average) {
                numberMonth++;
            }
        }
        return numberMonth;
    }

    public int monthSalesAboveAverage(long[] sales) {
        long average = averageAmountSalesMonth(sales);
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale > average) {
                numberMonth++;
            }
        }
        return numberMonth;
    }
}
