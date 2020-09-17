package stringAndStringBuilder;

import java.util.Scanner;

public class PrintCharactersAndSubstrings {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = scn.nextLine();
		
		printChar(s);
		System.out.println();
		printSubstring(s);

	}
	
	private static void printChar(String s) {
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
	
	private static void printSubstring(String s) {
		for(int i=0; i<=s.length(); i++) {
			for(int j=i+1; j<=s.length(); j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}
}
