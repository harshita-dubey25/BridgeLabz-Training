package com.ticketbookingSystem;

class EventAVL {
    EventNode root;

    int height(EventNode n) {
        return n == null ? 0 : n.height;
    }

    int balance(EventNode n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    EventNode rightRotate(EventNode y) {
        EventNode x = y.left;
        EventNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    EventNode leftRotate(EventNode x) {
        EventNode y = x.right;
        EventNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Scenario 1: Insert Event
    EventNode insert(EventNode node, String id, String name, int time) {
        if (node == null)
            return new EventNode(id, name, time);

        if (time < node.eventTime)
            node.left = insert(node.left, id, name, time);
        else
            node.right = insert(node.right, id, name, time);

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int bf = balance(node);

        // LL
        if (bf > 1 && time < node.left.eventTime)
            return rightRotate(node);

        // RR
        if (bf < -1 && time > node.right.eventTime)
            return leftRotate(node);

        // LR
        if (bf > 1 && time > node.left.eventTime) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (bf < -1 && time < node.right.eventTime) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Scenario 2: Cancel Event
    EventNode delete(EventNode root, int time) {
        if (root == null)
            return root;

        if (time < root.eventTime)
            root.left = delete(root.left, time);
        else if (time > root.eventTime)
            root.right = delete(root.right, time);
        else {
            if (root.left == null || root.right == null) {
                root = (root.left != null) ? root.left : root.right;
            } else {
                EventNode temp = minValue(root.right);
                root.eventTime = temp.eventTime;
                root.eventId = temp.eventId;
                root.eventName = temp.eventName;
                root.right = delete(root.right, temp.eventTime);
            }
        }

        if (root == null)
            return root;

        root.height = 1 + Math.max(height(root.left), height(root.right));
        int bf = balance(root);

        if (bf > 1 && balance(root.left) >= 0)
            return rightRotate(root);

        if (bf > 1 && balance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (bf < -1 && balance(root.right) <= 0)
            return leftRotate(root);

        if (bf < -1 && balance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    EventNode minValue(EventNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    // Scenario 3: Show Events in Order
    void inorder(EventNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(
                root.eventTime + " → " + root.eventName
            );
            inorder(root.right);
        }
    }
}
