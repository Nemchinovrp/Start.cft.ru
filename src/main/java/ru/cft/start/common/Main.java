package ru.cft.start.common;

import ru.cft.start.workwithfiles.ReadFile;
import ru.cft.start.workwithfiles.WriteToFile;

import java.io.IOException;

import static ru.cft.start.sort.CustomInsertionSort.*;
import static ru.cft.start.workwithfiles.ReadFile.readFileReturnIntArray;
import static ru.cft.start.workwithfiles.WriteToFile.writeIntsArrayToFile;

public class Main {
    public static void main(String... args) {
        if (args[2].equals("-i") && args[3].equals("-a")) {
            int[] readInts = insertionSort(readFileReturnIntArray(args[0]));
            try {
                writeIntsArrayToFile(readInts, args[1]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (args[2].equals("-i") && args[3].equals("-d")) {
            int[] readInts = insertionSortDec(readFileReturnIntArray(args[0]));
            try {
                writeIntsArrayToFile(readInts, args[1]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (args[2].equals("-s") && args[3].equals("-a")) {
            String[] readStrings = sortStrings(ReadFile.readFileReturnStringArray(args[0]), 4);
            WriteToFile.writeStringsArrayToFile(readStrings, args[1]);
        }
    }
}