package com.universityrecord;

public class UniversityRecordSystem {
    public static void main(String[] args) {
        StudentBST bst = new StudentBST();

        bst.root = bst.insert(bst.root, 102, "Aman");
        bst.insert(bst.root, 101, "Riya");
        bst.insert(bst.root, 105, "Neha");
        bst.insert(bst.root, 103, "Karan");

        // Scenario 3: Sorted Display
        System.out.println("Student Records (Sorted by Roll No):");
        bst.inorder(bst.root);

        // Scenario 3: Search
        System.out.println("\nSearching Roll No 103:");
        StudentNode result = bst.search(bst.root, 103);
        if (result != null)
            System.out.println("Found: " + result.name);
        else
            System.out.println("Student not found");

        // Scenario 2: Deletion
        System.out.println("\nDeleting Roll No 102...");
        bst.root = bst.delete(bst.root, 102);

        System.out.println("\nUpdated Student Records:");
        bst.inorder(bst.root);
    }
}
