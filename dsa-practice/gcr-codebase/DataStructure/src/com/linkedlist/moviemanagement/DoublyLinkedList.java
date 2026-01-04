package com.linkedlist.moviemanagement;

class DoublyLinkedList {
	
	private Movie head;
	private Movie tail;
	
	public void addMovieAtEnd(String title, String director, int releaseYear, double rating) {
		Movie movie = new Movie(title, director, releaseYear, rating);
		if(head==null) {
			head = tail =movie;
			System.out.println("Sucessfully added movie: "+movie.title);
			return;
		}
		else {
			tail.next = movie;
			movie.prev = tail;
			tail = movie;
		}
	}
	
	public void addMovieAtBeginning(String title, String director, int releaseYear, double rating) {
		Movie movie =new Movie(title, director, releaseYear, rating);
		
		if(head == null) {
			head = tail = movie;
		}else {
			movie.next = head;
			head.prev = movie;
			head = movie;
		}	
	}
	
	public void removeMovie(String title) {
        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                    else tail = null; // List became empty
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                System.out.println("Removed: " + title);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found.");
    }
	public void searchByRating(double minRating) {
        Movie current = head;
        System.out.println("Movies with rating >= " + minRating + ":");
        while (current != null) {
            if (current.rating >= minRating) {
                System.out.println("- " + current.title + " (" + current.rating + ")");
            }
            current = current.next;
        }
    }
	
	public void updateRating(String title, double newRating) {
        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                System.out.println("Updated " + title + " to " + newRating);
                return;
            }
            current = current.next;
        }
    }
	public void displayForward() {
        Movie current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.title + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
	
	public void displayReverse() {
        Movie current = tail;
        System.out.print("Reverse: ");
        while (current != null) {
            System.out.print(current.title + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }	
}