package com.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

    public static void main(String[] args) {

        String filePath = "E:\\Java programming workspace\\dsa-practice\\gcr-codebase\\DataStructure\\src\\com\\filehandling\\Sample.txt"; 

        
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;

            
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
