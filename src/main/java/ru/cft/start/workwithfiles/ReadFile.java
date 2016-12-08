package ru.cft.start.workwithfiles;

import ru.cft.start.exceptions.CannotReadFile;

import java.io.*;

public class ReadFile {

    public static int[] readFileReturnIntArray(String fileName) {
        File file = new File(fileName);
        if (!file.canRead()) {
            throw new CannotReadFile("File don't reading");
        }
        int indexArray = 0;
        int i = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));) {
            while (reader.ready()) {
                indexArray++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[] ints = new int[indexArray];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));) {
            while (reader.ready()) {
                ints[i] = Integer.parseInt(reader.readLine());
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ints;
    }

    public static String[] readFileReturnStringArray(String fileName) {
        File file = new File(fileName);
        if (!file.canRead()) {
            throw new CannotReadFile("File don't reading");
        }
        int indexArray = 0;
        int i = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));) {
            while (reader.ready()) {
                indexArray++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] strings = new String[indexArray];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));) {
            while (reader.ready()) {
                strings[i] = reader.readLine();
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }
}
