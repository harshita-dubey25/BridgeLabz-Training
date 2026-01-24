package com.musicapp;

public class MusicAppLibrary {
    public static void main(String[] args) {

        MusicBST library = new MusicBST();

        library.root = library.insert(library.root, 101, "Believer", "Imagine Dragons");
        library.insert(library.root, 105, "Closer", "Chainsmokers");
        library.insert(library.root, 103, "Apna Bana Le", "Arijit Singh");
        library.insert(library.root, 110, "Dreamers", "Jung Kook");

        System.out.println("Searching Track ID 103:");
        SongNode song = library.searchById(library.root, 103);
        if (song != null)
            System.out.println("Found: " + song.title + " by " + song.artist);
        else
            System.out.println("Track not found");

        System.out.println("\nPlaylist (Alphabetical Order):");
        library.inorder(library.root);
    }
}
