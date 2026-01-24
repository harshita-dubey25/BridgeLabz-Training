package com.gamingapp;

public class GamingLeaderBoard {
    public static void main(String[] args) {

        LeaderBoardAVL board = new LeaderBoardAVL();

        board.root = board.insert(board.root, 1, "Ravi", 1200);
        board.insert(board.root, 2, "Ananya", 1500);
        board.insert(board.root, 3, "Kabir", 900);
        board.insert(board.root, 4, "Neha", 1700);
        board.insert(board.root, 5, "Arjun", 1400);

        System.out.println("🏆 Top Players:");
        board.topPlayers(board.root, new int[]{0});

        System.out.println("\n🚫 Removing Kabir...");
        board.root = board.delete(board.root, 900, 3);

        System.out.println("\n🏆 Updated Leaderboard:");
        board.topPlayers(board.root, new int[]{0});
    }
}
