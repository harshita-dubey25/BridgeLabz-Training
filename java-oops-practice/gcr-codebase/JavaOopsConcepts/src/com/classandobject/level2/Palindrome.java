package com.classandobject.level2;

public class Palindrome {
		String text;
		
		Palindrome(String text) {
			this.text=text;
			
		}
		public boolean isPalindrome() {//To remove the space and return consistent text
		String cleantext=text.replaceAll("\\s","").toLowerCase();
		
		String reverseText=new StringBuilder(cleantext).reverse().toString();
		
		return cleantext.equals(reverseText);
		}
		
		public void diplayResult() {
			if(isPalindrome()) {
				System.out.println(text+" is palindrome");
				}
			else {
				System.out.println(text+" is not Palindrome");
			}
		}
}

