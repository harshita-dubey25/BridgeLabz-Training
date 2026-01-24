package com.gamingapp;

class PlayerNode {
    int score, height;
    int playerId;
    String name;
    PlayerNode left, right;

    PlayerNode(int id, String name, int score) {
        this.playerId = id;
        this.name = name;
        this.score = score;
        height = 1;
    }
}
