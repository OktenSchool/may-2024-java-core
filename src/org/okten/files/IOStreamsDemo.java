package org.okten.files;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class IOStreamsDemo {

    // I/O - Input / Output

    // I/O Streams - Input / Output Streams (NOT Stream API - Stream API is different from IO Streams)

    public static void main(String[] args) {
//        demoTryWithResources();

        String file = "data/test.txt";
        System.out.println("Reading from file:");
        System.out.println(readFileContentWithInputStream(file));
        System.out.println("---------------------------------");
        System.out.println("Reading persons from file:");
        List<Person> people = readPersonsFromFileWithInputStream(file);
        System.out.println(people);
        System.out.println("---------------------------------");
        System.out.println("Writing to file...");
        writeToFileWithOutputStream(file, "Alice, 25, Music");
        System.out.println("---------------------------------");
        System.out.println("Reading from file after write:");
        String fileContent = readFileContentWithInputStream(file);
        System.out.println(fileContent);
        System.out.println("---------------------------------");
    }

    // final, finally, finalize

    private static void demoTryWithResources() {
        try {
            System.out.println(5/ 0);
            System.out.println("never...");
        } finally {
            System.out.println("finally!");
        }
        System.out.println("never...");
    }

    private static String readFileContentWithInputStream(String pathToFile) {
        File file = new File(pathToFile);
        // TWS - try-with-resources block
        try (InputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = inputStream.readAllBytes();
            String content = new String(bytes, StandardCharsets.UTF_8);
            return content;
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Details: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }
        return "";
    }

    private static List<Person> readPersonsFromFileWithInputStream(String pathToFile) {
        File file = new File(pathToFile);
        try (InputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = inputStream.readAllBytes();
            String content = new String(bytes, StandardCharsets.UTF_8);
            String[] lines = content.replaceAll("\r", "").split("\n");
            List<Person> people = new LinkedList<>();
            for (String line : lines) {
                String[] data = line.split(", ");
                Person person = new Person(data[0], Integer.parseInt(data[1]), data[2]);
                people.add(person);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Details: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }
        return Collections.emptyList();
    }

    private static void writeToFileWithOutputStreamWithoutTryWithResource(String pathToFile, String content) {
        File file = new File(pathToFile);
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file, false);
            byte[] data = content.getBytes(StandardCharsets.UTF_8);
            outputStream.write(data);
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Details: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Unable to write to file");
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static void writeToFileWithOutputStream(String pathToFile, String content) {
        File file = new File(pathToFile);
        try (OutputStream outputStream = new FileOutputStream(file, false)){
            byte[] data = content.getBytes(StandardCharsets.UTF_8);
            outputStream.write(data);
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Details: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Unable to write to file");
        }
    }
}
