package com.linkedlist.socialmedia;
import java.util.*;

public class UserNode {
	int userId;
    String name;
    int age;
    List<Integer> friendIds; 
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}