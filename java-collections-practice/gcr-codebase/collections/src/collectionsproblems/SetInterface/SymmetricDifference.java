package collectionsproblems.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		
		s1.add(1);
		s1.add(2);
		s1.add(3);
		
		Set<Integer> s2 = new HashSet<>();
		s2.add(4);
		s2.add(5);
		s2.add(3);
		
		HashSet<Integer> union = new HashSet<>(s1);
		union.addAll(s2);
		HashSet<Integer> intersection = new HashSet<>(s1);
		intersection.retainAll(s2);
		HashSet<Integer> symmetricDiff = new HashSet<>(union);
		symmetricDiff.removeAll(intersection);
		
		System.out.println("Set 1: "+s1.toString());
		System.out.println("Set 2: "+s2.toString());
		
		System.out.println("Symmetric Difference of Set 1 and Set 2: "+symmetricDiff.toString());
	}
}
