package ru.netology.stats;

public class StatsService {
    public static int sumcalc(int[] purchases) {
        int sum=0;
        for (int purchase : purchases) {
            sum+=purchase;
        }
        return sum;
    }

    public static int averagecalc(int[] purchases) {
        int sum = sumcalc(purchases);
        int average = sum / purchases.length;
        return average;
    }

    public static int maxcalc(int[] purchases) {
        int currentMax = purchases[0];
        for (int purchase : purchases) {
            if( currentMax < purchase) {
            currentMax = purchase;
            }
        }
        return currentMax;
    }

    public static int mincalc(int[] purchases) {
        int currentMin = purchases[0];
        for (int purchase : purchases) {
            if( currentMin > purchase) {
                currentMin = purchase;
            }
        }
        return currentMin;
    }

    public static int lowaveragecalc(int[] purchases) {
        int sum=0;
        for (int purchase : purchases) {
            sum+=purchase;
        }
        int average = sum / purchases.length;

        int LowMonth = 0;
        for (int purchase : purchases) {
            if( purchase < average) {
                LowMonth += 1;
            }
        }
        return LowMonth;
    }

    public static int highaveragecalc(int[] purchases) {
        int average = averagecalc(purchases);
        int HighMonth = 0;
        for (int purchase : purchases) {
            if( purchase >= average) {
                HighMonth += 1;
            }
        }
        return HighMonth;
    }
}