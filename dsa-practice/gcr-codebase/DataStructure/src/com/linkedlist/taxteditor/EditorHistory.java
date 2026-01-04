package com.linkedlist.taxteditor;

public class EditorHistory {
	private TextStateNode head;
    private TextStateNode currentState;
    private int maxSize = 10;
    private int currentSize = 0;

    public EditorHistory(String initialContent) {
        TextStateNode firstState = new TextStateNode(initialContent);
        head = firstState;
        currentState = firstState;
        currentSize = 1;
    }

    public void addState(String newContent) {
        currentState.next = null;

        TextStateNode newNode = new TextStateNode(newContent);
        newNode.prev = currentState;
        currentState.next = newNode;
        currentState = newNode;
        currentSize++;

        if (currentSize > maxSize) {
            head = head.next;
            head.prev = null;
            currentSize--;
        }
    }

    public void undo() {
        if (currentState.prev != null) {
            currentState = currentState.prev;
            System.out.println("Undo performed.");
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void redo() {
        if (currentState.next != null) {
            currentState = currentState.next;
            System.out.println("Redo performed.");
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    public void displayCurrent() {
        System.out.println("Current Text: \"" + currentState.content + "\"");
    }
}
