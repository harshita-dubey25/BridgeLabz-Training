package com.hospitalqueuemanagement;

class HospitalAVL {
    PatientNode root;

    int height(PatientNode n) {
        return n == null ? 0 : n.height;
    }

    int balance(PatientNode n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    PatientNode rightRotate(PatientNode y) {
        PatientNode x = y.left;
        PatientNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    PatientNode leftRotate(PatientNode x) {
        PatientNode y = x.right;
        PatientNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    PatientNode insert(PatientNode node, String id, String name, int time) {
        if (node == null)
            return new PatientNode(id, name, time);

        if (time < node.checkInTime)
            node.left = insert(node.left, id, name, time);
        else
            node.right = insert(node.right, id, name, time);

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int bf = balance(node);

        // LL
        if (bf > 1 && time < node.left.checkInTime)
            return rightRotate(node);

        // RR
        if (bf < -1 && time > node.right.checkInTime)
            return leftRotate(node);

        // LR
        if (bf > 1 && time > node.left.checkInTime) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (bf < -1 && time < node.right.checkInTime) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Scenario 2: Discharge Patient
    PatientNode delete(PatientNode root, int time) {
        if (root == null)
            return root;

        if (time < root.checkInTime)
            root.left = delete(root.left, time);
        else if (time > root.checkInTime)
            root.right = delete(root.right, time);
        else {
            if (root.left == null || root.right == null) {
                root = (root.left != null) ? root.left : root.right;
            } else {
                PatientNode temp = minValue(root.right);
                root.checkInTime = temp.checkInTime;
                root.patientId = temp.patientId;
                root.name = temp.name;
                root.right = delete(root.right, temp.checkInTime);
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

    PatientNode minValue(PatientNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    // Scenario 3: Display Patients by Arrival Time
    void inorder(PatientNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(
                root.checkInTime + " → " + root.name +
                " (ID: " + root.patientId + ")"
            );
            inorder(root.right);
        }
    }
}
