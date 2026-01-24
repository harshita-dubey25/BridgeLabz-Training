package com.universityrecord;

class StudentBST {
    StudentNode root;

    // Scenario 1: Insert
    StudentNode insert(StudentNode root, int rollNo, String name) {
        if (root == null)
            return new StudentNode(rollNo, name);

        if (rollNo < root.rollNo)
            root.left = insert(root.left, rollNo, name);
        else if (rollNo > root.rollNo)
            root.right = insert(root.right, rollNo, name);

        return root;
    }

    // Scenario 3: Search
    StudentNode search(StudentNode root, int rollNo) {
        if (root == null || root.rollNo == rollNo)
            return root;

        if (rollNo < root.rollNo)
            return search(root.left, rollNo);

        return search(root.right, rollNo);
    }

    // Find minimum value node (used in deletion)
    StudentNode minValueNode(StudentNode node) {
        StudentNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Scenario 2: Delete
    StudentNode delete(StudentNode root, int rollNo) {
        if (root == null)
            return root;

        if (rollNo < root.rollNo)
            root.left = delete(root.left, rollNo);
        else if (rollNo > root.rollNo)
            root.right = delete(root.right, rollNo);
        else {
            // Node with one or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node with two children
            StudentNode temp = minValueNode(root.right);
            root.rollNo = temp.rollNo;
            root.name = temp.name;
            root.right = delete(root.right, temp.rollNo);
        }
        return root;
    }

    // Scenario 3: Sorted Display (Inorder Traversal)
    void inorder(StudentNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Roll No: " + root.rollNo + ", Name: " + root.name);
            inorder(root.right);
        }
    }
}
