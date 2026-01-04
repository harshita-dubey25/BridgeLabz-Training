package com.linkedlist.taxteditor;
import java.util.*;

public class TextMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EditorHistory history = new EditorHistory(""); 

        while (true) {
            history.displayCurrent();
            System.out.println("\nOptions: [1] Type [2] Undo [3] Redo [4] Exit");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter text: ");
                String text = sc.nextLine();
                history.addState(text);
            } else if (choice == 2) {
                history.undo();
            } else if (choice == 3) {
                history.redo();
            } else {
                break;
            }
        }
        sc.close();
    }
}