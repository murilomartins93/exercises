package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();
		Set<Integer> setC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			setA.add(sc.nextInt());
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			setB.add(sc.nextInt());
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			setC.add(sc.nextInt());
		}
		
		Set<Integer> setU = new HashSet<>(setA);
		setU.addAll(setB);
		setU.addAll(setC);
		
		System.out.print("Total students: " + setU.size());
		
		sc.close();
	}

}
