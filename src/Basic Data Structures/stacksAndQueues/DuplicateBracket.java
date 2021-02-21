package stacksAndQueues;

import java.util.*;

public class DuplicateBracket {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		Stack<Character> st = new Stack<>();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == ')') {
				if(st.peek() != '(') {
					while(st.peek()!= '(' && st.empty() == false) {
						st.pop();
					}
					if(st.empty() == false) {
						st.pop();
					}
				}else {
					System.out.println("true");
					return ;
				}
			}else {
				st.push(ch);
			}
		}
		System.out.println("false");
    }
}
