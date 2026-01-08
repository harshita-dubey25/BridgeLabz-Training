package com.filehandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteStreamToCharacterStream{
    public static void main(String[] args) {

        String filePath = "E:\\Java programming workspace\\dsa-practice\\gcr-codebase\\DataStructure\\src\\com\\filehandling\\Sample.txt"; 
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file or encoding issue: " + e.getMessage());
        }
    }
}

