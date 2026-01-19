package collectionsproblems.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class Subsets {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		
		s1.add(1);
		s1.add(6);
		s1.add(3);
		s1.add(4);
		s1.add(2);
		s1.add(5);
		
		Set<Integer> s2 = new HashSet<>();
		
		s2.add(3);
		s2.add(5);
		s2.add(7);
		
		Set<Integer> s3 = new HashSet<>(s1);
		s3.retainAll(s2);
		
		System.out.println("set 1: "+s1.toString());
		System.out.println("set 2: "+s2.toString());
		
		System.out.println("Set 2 is Subset of Set 1:"+s3.equals(s2));
	}
}
