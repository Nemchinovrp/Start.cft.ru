package ru.cft.start.sort;

public class CustomInsertionSort {
    public static int[] insertionSort(int[] arr) {
        int i, j, newValue;
        for (i = 1; i < arr.length; i++) {
            newValue = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > newValue) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = newValue;
        }
        int[] result = new int[arr.length];
        for (int y = 0; y < arr.length; y++) {
            result[y] = arr[y];
        }
        return result;
    }

    public static int[] insertionSortDec(int[] arr) {
        int i, j, newValue;
        for (i = 1; i < arr.length; i++) {
            newValue = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] < newValue) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = newValue;
        }
        int[] result = new int[arr.length];
        for (int y = 0; y < arr.length; y++) {
            result[y] = arr[y];
        }
        return result;
    }

    public static String[] sortStrings(String[] array, int n) {
        for (int i = 1; i < n; i++) {
            insert(array, i);
        }
        String[] result = new String[array.length];
        for (int y = 0; y < array.length; y++) {
            result[y] = array[y];
        }
        return result;
    }

    public static void insert(String[] strings, int i) {
        String temp = strings[i];
        int j = i - 1;

        while (j >= 0 && strings[j].compareToIgnoreCase(temp) > 0) {
            strings[j + 1] = strings[j];
            j--;
        }
        strings[j + 1] = temp;
    }
}
