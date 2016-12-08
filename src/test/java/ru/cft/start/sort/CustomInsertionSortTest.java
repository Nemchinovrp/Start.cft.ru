package ru.cft.start.sort;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

import static ru.cft.start.sort.CustomInsertionSort.*;

public class CustomInsertionSortTest {
    @Test
    public void testSortInc() {
        int[] actual = {3, 5, 4, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(insertionSort(actual)));
    }

    @Test
    public void testSortDec() {
        int[] actual = {3, 5, 4, 2, 1};
        int[] expected = {5, 4, 3, 2, 1};
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(insertionSortDec(actual)));
    }

    @Test
    public void testSortStringInc() {
        String[] actual = {"One", "Two", "Three", "Four"};
        String[] expected = {"Four", "One", "Three", "Two"};
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(sortStrings(actual, 4)));
    }
}

