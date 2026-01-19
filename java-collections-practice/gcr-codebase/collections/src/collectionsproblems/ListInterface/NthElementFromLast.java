package collectionsproblems.ListInterface;

import java.util.*;

public class NthElementFromLast {
	public static void main(String[] args) {
		Character arr[] = {'A', 'B', 'C', 'D', 'E'};
		int n = 2;
		List<Character> lst =  Arrays.asList(arr);
		
		int size = lst.size();
		int index = size-n;
		
		char ch =(char) lst.get(index);
		System.out.println("character at "+n+" position from last is: "+ch);
	}
}