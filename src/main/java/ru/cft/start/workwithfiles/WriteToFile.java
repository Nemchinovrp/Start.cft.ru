package ru.cft.start.workwithfiles;

import ru.cft.start.exceptions.CannotWriteToFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void writeIntsArrayToFile(int[] array, String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.canWrite()) {
            throw new CannotWriteToFile("Array don't write to file");
        }
        BufferedWriter outputWriter = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < array.length; i++) {
            outputWriter.write(Integer.toString(array[i]));
            outputWriter.newLine();
        }
        outputWriter.flush();
        outputWriter.close();
    }

    public static void writeStringsArrayToFile(String[] array, String fileName) {
        File file = new File(fileName);
        if (!file.canWrite()) {
            throw new CannotWriteToFile("Array don't write to file");
        }
    }
}
