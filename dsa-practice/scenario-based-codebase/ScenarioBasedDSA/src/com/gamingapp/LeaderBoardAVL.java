package com.gamingapp;

class LeaderBoardAVL {
    PlayerNode root;

    int height(PlayerNode n) {
        return n == null ? 0 : n.height;
    }

    int getBalance(PlayerNode n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    PlayerNode rightRotate(PlayerNode y) {
        PlayerNode x = y.left;
        PlayerNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    PlayerNode leftRotate(PlayerNode x) {
        PlayerNode y = x.right;
        PlayerNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Scenario 1: Insert / Update
    PlayerNode insert(PlayerNode node, int id, String name, int score) {
        if (node == null)
            return new PlayerNode(id, name, score);

        if (score > node.score ||
           (score == node.score && id < node.playerId))
            node.right = insert(node.right, id, name, score);
        else
            node.left = insert(node.left, id, name, score);

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // Rotations
        if (balance > 1 && score < node.left.score)
            return rightRotate(node);

        if (balance < -1 && score > node.right.score)
            return leftRotate(node);

        if (balance > 1 && score > node.left.score) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && score < node.right.score) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Scenario 3: Remove Player
    PlayerNode delete(PlayerNode root, int score, int id) {
        if (root == null)
            return root;

        if (score < root.score)
            root.left = delete(root.left, score, id);
        else if (score > root.score)
            root.right = delete(root.right, score, id);
        else {
            if (root.left == null || root.right == null) {
                PlayerNode temp = root.left != null ? root.left : root.right;
                root = temp;
            } else {
                PlayerNode temp = minValue(root.right);
                root.score = temp.score;
                root.playerId = temp.playerId;
                root.name = temp.name;
                root.right = delete(root.right, temp.score, temp.playerId);
            }
        }

        if (root == null)
            return root;

        root.height = 1 + Math.max(height(root.left), height(root.right));
        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    PlayerNode minValue(PlayerNode node) {
        PlayerNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Scenario 2: Top Players
    void topPlayers(PlayerNode root, int[] count) {
        if (root == null || count[0] >= 10)
            return;

        topPlayers(root.right, count);
        if (count[0] < 10) {
            System.out.println(
                "Rank " + (count[0] + 1) +
                ": " + root.name +
                " (" + root.score + " pts)"
            );
            count[0]++;
        }
        topPlayers(root.left, count);
    }
}
