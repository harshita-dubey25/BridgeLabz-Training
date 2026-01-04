package com.linkedlist.socialmedia;
import java.util.*;

public class SocialNetwork {
	private UserNode head;

    public void addUser(int id, String name, int age) {
        UserNode newNode = new UserNode(id, name, age);
        if (head == null) {
            head = newNode;
        } else {
            UserNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    private UserNode findUser(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }
    public void addFriendship(int id1, int id2) {
        UserNode user1 = findUser(id1);
        UserNode user2 = findUser(id2);

        if (user1 != null && user2 != null) {
            if (!user1.friendIds.contains(id2)) {
                user1.friendIds.add(id2);
                user2.friendIds.add(id1);
                System.out.println(user1.name + " and " + user2.name + " are now friends.");
            }
        } else {
            System.out.println("One or both users not found.");
        }
    }

    public void findMutualFriends(int id1, int id2) {
        UserNode u1 = findUser(id1);
        UserNode u2 = findUser(id2);

        if (u1 == null || u2 == null) return;

        System.out.print("Mutual friends between " + u1.name + " and " + u2.name + ": ");
        List<Integer> mutuals = new ArrayList<>(u1.friendIds);
        mutuals.retainAll(u2.friendIds); 

        if (mutuals.isEmpty()) {
            System.out.println("None");
        } else {
            for (int id : mutuals) {
                UserNode friend = findUser(id);
                System.out.print(friend.name + " ");
            }
            System.out.println();
        }
    }

    public void displayFriends(int id) {
        UserNode user = findUser(id);
        if (user != null) {
            System.out.print(user.name + "'s Friends: ");
            for (int fId : user.friendIds) {
                UserNode friend = findUser(fId);
                System.out.print(friend.name + " (ID: " + fId + ") ");
            }
            System.out.println();
        }
    }
}