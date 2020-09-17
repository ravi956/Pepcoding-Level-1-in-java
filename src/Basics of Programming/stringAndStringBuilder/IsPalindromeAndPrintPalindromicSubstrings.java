package stringAndStringBuilder;

import java.util.Scanner;

public class IsPalindromeAndPrintPalindromicSubstrings {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = scn.nextLine();
		
//		System.out.println(isPalindrome(s));
		printPalindromicSubstrings(s);

	}
	
	public static boolean isPalindrome(String s) {
		int i=0, j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	private static void printPalindromicSubstrings(String s) {
		for(int i=0; i<=s.length(); i++) {
			for(int j=i+1; j<=s.length(); j++) {
				String ss = s.substring(i,j);
				if(isPalindrome(ss))
					System.out.println(ss);
			}
		}
	}
}
