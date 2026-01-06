package com.LinearSearch;
import java.util.*;
public class SpecificWord {
	static void findWord(String[] arr, String word) {
		int count = 0;
		for(String a : arr){
			String[] words = a.split("\\s+");
			for(int i=0;i<words.length;i++) {
				if(words[i].equals(word)) {
					System.out.println(a);
					return ;
				}
			}
			count++;
		}
		if(count==arr.length) {
			System.out.println("Not Found!!!");
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] sentences = {"My name is Harshita Dubey","I am 22 years old","I am in final year","I live in Bhopal"};
		System.out.print("Enter a word to search: ");
		String w = in.next();
		findWord(sentences,w);
			
	}
}
