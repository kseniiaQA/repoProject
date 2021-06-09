package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatstServiceTest {


    @org.junit.jupiter.api.Test
    void findSales() {
        StatstService service = new StatstService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.findSales(sales);

        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    void findMiddle() {
        StatstService service = new StatstService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findMiddle(sales);
        assertEquals(expected, actual);


    }


    @org.junit.jupiter.api.Test
    void findBiggest() {

        StatstService service = new StatstService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected1 = 6;
        int expected2 = 8;


        int actual = service.findBiggest(sales);

        assertEquals(expected1, expected2, actual);

    }


    @org.junit.jupiter.api.Test
    void findSmallest() {
        StatstService service = new StatstService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findSmallest(sales);
        assertEquals(expected, actual);


    }


    @Test
    void findLessThanMiddle() {
        StatstService service = new StatstService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int middle=15;

        int actual = service.findLessThanMiddle(sales, middle);
        assertEquals(expected, actual);


    }

    @Test
    void findMoreThanMiddle() {
        StatstService service = new StatstService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;


        int middle=15;
        int actual = service.findMoreThanMiddle(sales, middle);
        assertEquals(expected, actual);


    }
}




