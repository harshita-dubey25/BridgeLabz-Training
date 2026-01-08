package com.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordOccurance {

    public static void main(String[] args) {

        String filePath = "E:\\\\Java programming workspace\\\\dsa-practice\\\\gcr-codebase\\\\DataStructure\\\\src\\\\com\\\\filehandling\\\\Sample.txt";   // file to read
        String targetWord = "name";       

        int count = 0;

        
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;

            while ((line = br.readLine()) != null) {

                
                String[] words = line.split("\\s+");

                
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            System.out.println("The word \"" + targetWord + "\" appears " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

