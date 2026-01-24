package com.ecommerceinventory;

public class EcommerceInventory {
    public static void main(String[] args) {

        ProductBST inventory = new ProductBST();

        inventory.root = inventory.insert(inventory.root, 3002, "Laptop", 65000);
        inventory.insert(inventory.root, 3001, "Mouse", 800);
        inventory.insert(inventory.root, 3005, "Keyboard", 1500);
        inventory.insert(inventory.root, 3003, "Monitor", 12000);

        System.out.println("Searching SKU 3003:");
        ProductNode p = inventory.search(inventory.root, 3003);
        if (p != null)
            System.out.println(p.name + " - ₹" + p.price);

        System.out.println("\nUpdating price of SKU 3001...");
        inventory.updatePrice(3001, 900);

        System.out.println("\nProduct List (Sorted by SKU):");
        inventory.inorder(inventory.root);
    }
}


