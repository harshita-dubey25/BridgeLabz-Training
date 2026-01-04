package com.linkedlist.taxteditor;

public class TextStateNode {
	public String content;
    public TextStateNode prev;
    public TextStateNode next;

    public TextStateNode(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}