package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		
		
		System.out.print("How many students for course A?");
		int number = sc.nextInt();
		
		for(int i = 1; i <= number; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.print("How many students for course B?");
		number = sc.nextInt();
		
		for(int i = 1; i <= number; i++) {
			set.add(sc.nextInt());
		}

		System.out.print("How many students for course C?");
		number = sc.nextInt();
		
		for(int i = 1; i <= number; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.println("Total students: " + set.size());
		
		sc.close();
	}

}
