package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void shouldCalculateSumPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = StatsService.sumcalc(purchases);
        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateAveragePurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = StatsService.averagecalc(purchases);
        assertEquals(actual, expected);
    }
    @Test
    void shouldCalculateMaxPurchase() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 20;
        int actual = StatsService.maxcalc(purchases);
        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateMinPurchase() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        int actual = StatsService.mincalc(purchases);
        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateLowerThanAveragePurchase() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = StatsService.lowaveragecalc(purchases);
        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateHigherThanAveragePurchase() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        int actual = StatsService.highaveragecalc(purchases);
        assertEquals(actual, expected);
    }

}
