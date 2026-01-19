package collectionsproblems.SetInterface;

import java.util.*;

public class SetToSortedList {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		
		s1.add(7);
		s1.add(4);
		s1.add(1564);
		s1.add(0);
		s1.add(2654);
		s1.add(3078);
		s1.add(77);
		s1.add(40215);
		s1.add(154);
		s1.add(40);
		s1.add(264);
		s1.add(3);
		
		
		System.out.println("Set before Conversion: "+s1.toString());
		
		List<Integer> list = new ArrayList<Integer>(s1);
		
		Collections.sort(list);
		
		System.out.println("Set after Conversion: "+list.toString());
	}
}
