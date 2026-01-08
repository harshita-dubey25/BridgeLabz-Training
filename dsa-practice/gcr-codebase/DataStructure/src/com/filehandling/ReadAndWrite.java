package com.filehandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite{

    public static void main(String[] args) {

        String filePath = "E:\\Java programming workspace\\dsa-practice\\gcr-codebase\\DataStructure\\src\\com\\filehandling\\User_Input.txt";

        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter fw = new FileWriter(filePath)) {

            System.out.println("Enter text (type 'exit' to stop):");

            String input;

            
            while (true) {
                input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                
                fw.write(input + System.lineSeparator());
            }

            System.out.println("Input successfully written to file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
