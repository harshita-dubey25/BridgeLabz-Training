package com.ecommerceinventory;

class ProductBST {
    ProductNode root;
    
    ProductNode insert(ProductNode root, int sku, String name, double price) {
        if (root == null)
            return new ProductNode(sku, name, price);

        if (sku < root.sku)
            root.left = insert(root.left, sku, name, price);
        else if (sku > root.sku)
            root.right = insert(root.right, sku, name, price);

        return root;
    }

    ProductNode search(ProductNode root, int sku) {
        if (root == null || root.sku == sku)
            return root;

        if (sku < root.sku)
            return search(root.left, sku);

        return search(root.right, sku);
    }

    void updatePrice(int sku, double newPrice) {
        ProductNode product = search(root, sku);
        if (product != null) {
            product.price = newPrice;
            System.out.println("Price updated successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }

    void inorder(ProductNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(
                "SKU: " + root.sku +
                ", Name: " + root.name +
                ", Price: ₹" + root.price
            );
            inorder(root.right);
        }
    }
}
