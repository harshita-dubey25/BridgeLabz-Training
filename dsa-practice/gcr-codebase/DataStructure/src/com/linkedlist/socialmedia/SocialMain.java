package com.linkedlist.socialmedia;

public class SocialMain {
	public static void main(String[] args) {
        SocialNetwork sn = new SocialNetwork();

       
        sn.addUser(1, "Himesh", 25);
        sn.addUser(2, "Lucky", 28);
        sn.addUser(3, "Nageshwar", 24);
        sn.addUser(4, "Rajeev", 27);

        sn.addFriendship(1, 2); 
        sn.addFriendship(1, 3); 
        sn.addFriendship(2, 3); 
        sn.addFriendship(2, 4); 

        sn.displayFriends(2);
        sn.findMutualFriends(1, 2);
    }
}
