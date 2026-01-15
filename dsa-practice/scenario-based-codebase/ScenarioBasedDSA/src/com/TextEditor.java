package com;

import java.util.Stack;

public class TextEditor {

    private String text = "";

    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();

    public void insert(String newText) {
        undoStack.push(text);   
        text += newText;
        redoStack.clear();      
        System.out.println("Inserted: " + newText);
    }

    public void delete(int n) {
        if (n > text.length()) {
            n = text.length();
        }
        undoStack.push(text);   
        text = text.substring(0, text.length() - n);
        redoStack.clear();
        System.out.println("Deleted last " + n + " characters");
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(text);
            text = undoStack.pop();
            System.out.println("Undo performed");
        } else {
            System.out.println("Nothing to undo");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(text);
            text = redoStack.pop();
            System.out.println("Redo performed");
        } else {
            System.out.println("Nothing to redo");
        }
    }

    public void display() {
        System.out.println("Current Text: \"" + text + "\"");
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.insert("Hello");
        editor.insert(" World");
        editor.display();

        editor.delete(6);
        editor.display();

        editor.undo();
        editor.display();

        editor.redo();
        editor.display();
    }
}
