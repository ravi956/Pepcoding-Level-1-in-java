package introductionToRecursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int fact = factorial(n);
		System.out.println(fact);
	}
	
	public static int factorial(int n) {
		if(n==0)
			return 1;
		
		return n*factorial(n-1);
	}

}
