package stringAndStringBuilder;

import java.util.Scanner;

public class ToggleChars {

	public static void main(String[] args) {
		
		System.out.println("Enter the string : ");
		Scanner scn = new Scanner(System.in);
		
		String str = scn.nextLine();
		System.out.println(toggleChar(str));
	}
	
	private static String toggleChar(String str) {
		StringBuilder sb = new StringBuilder(str);
		for(int i=0; i<sb.length(); i++) {
			char ch = sb.charAt(i);
			if(ch>='a' && ch<='z') {
				ch = (char) (ch - 'a' + 'A');
			}else {
				ch = (char) (ch - 'A' + 'a');
			}
			sb.setCharAt(i, ch);
		}
		return sb.toString();
	}
}
