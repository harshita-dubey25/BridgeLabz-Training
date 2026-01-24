package com.musicapp;

class MusicBST {
    SongNode root;


    SongNode insert(SongNode root, int id, String title, String artist) {
        if (root == null)
            return new SongNode(id, title, artist);

        if (title.compareToIgnoreCase(root.title) < 0)
            root.left = insert(root.left, id, title, artist);
        else
            root.right = insert(root.right, id, title, artist);

        return root;
    }

    SongNode searchById(SongNode root, int id) {
        if (root == null)
            return null;

        if (root.trackId == id)
            return root;

        SongNode leftResult = searchById(root.left, id);
        if (leftResult != null)
            return leftResult;

        return searchById(root.right, id);
    }


    void inorder(SongNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(
                "Title: " + root.title +
                ", Artist: " + root.artist +
                ", Track ID: " + root.trackId
            );
            inorder(root.right);
        }
    }
}
