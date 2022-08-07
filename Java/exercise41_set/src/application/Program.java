package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {

		//HashSet - não garante ordem mas é mais rápido
		Set<String> set1 = new HashSet<>();
		set1.add("Tv");
		set1.add("Tablet");
		set1.add("Notebook");
		System.out.println(set1.contains("Notebook"));
		for (String p : set1) {
			System.out.println(p);
		}		
		System.out.println();
		
		//TreeSet - ordena e mais devagar
		Set<String> set2 = new TreeSet<>();
		set2.add("Tv");
		set2.add("Tablet");
		set2.add("Notebook");
		System.out.println(set2.contains("Notebook"));
		for (String p : set2) {
			System.out.println(p);
		}
		System.out.println();
		
		//LinkedSet - intermediário e mantem a ordem
		Set<String> set3 = new LinkedHashSet<>();
		set3.add("Tv");
		set3.add("Tablet");
		set3.add("Notebook");
		System.out.println(set3.contains("Notebook"));
		for (String p : set3) {
			System.out.println(p);
		}
		System.out.println();

		
		//remove
		set1.remove("Tablet");
		set2.removeIf(x -> x.length() >= 3);
		
		for (String p : set1) {
			System.out.println(p);
		}
		System.out.println();
		
		for (String p : set2) {
			System.out.println(p);
		}
		System.out.println();
		
		
		// Union, Intersection and Difference
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		// Union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		// Intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		// Difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);

	}
}