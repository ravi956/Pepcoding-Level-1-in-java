package stringAndStringBuilder;

import java.util.Scanner;

public class ModifyString {

	public static void main(String[] args) {
		
		System.out.println("Enter the string : ");
		Scanner scn = new Scanner(System.in);
		
		String str = scn.nextLine();
		System.out.println(modifyString(str));

	}
	
	private static String modifyString(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length()-1; i++) {
			char ch1 = str.charAt(i); 
			char ch2 = str.charAt(i+1);
			sb.append(ch1);
			sb.append(ch2-ch1);
		}
		sb.append(str.charAt(str.length()-1));
		return sb.toString();
	}
}
