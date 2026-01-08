package com.runtimeanalysis;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileHandlingPerformanceAnalysis {

    public static long countWordsUsingFileReader(String filePath) throws IOException {
        long wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
        }
        return wordCount;
    }

    public static long countWordsUsingInputStreamReader(String filePath) throws IOException {
        long wordCount = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filePath),
                        StandardCharsets.UTF_8))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
        }
        return wordCount;
    }

    public static void main(String[] args) throws IOException {

        String filePath = "E:\\\\Java programming workspace\\\\dsa-practice\\\\gcr-codebase\\\\DataStructure\\\\src\\\\com\\\\runtimeanalysis\\\\Sample.txt"; // ~100MB text file

        // -------- FileReader Timing --------
        long startFileReader = System.nanoTime();
        long wordsFR = countWordsUsingFileReader(filePath);
        long endFileReader = System.nanoTime();

        // -------- InputStreamReader Timing --------
        long startISR = System.nanoTime();
        long wordsISR = countWordsUsingInputStreamReader(filePath);
        long endISR = System.nanoTime();

        // -------- Results --------
        System.out.println("FileReader Word Count       : " + wordsFR);
        System.out.println("FileReader Time Taken       : " +
                (endFileReader - startFileReader) / 1_000_000 + " ms");

        System.out.println("----------------------------------------");

        System.out.println("InputStreamReader Word Count: " + wordsISR);
        System.out.println("InputStreamReader Time Taken: " +
                (endISR - startISR) / 1_000_000 + " ms");
    }
}
