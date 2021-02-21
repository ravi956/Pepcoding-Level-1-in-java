package stacksAndQueues;

import java.util.*;

public class BalancedBrackets {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);

		String str = scn.nextLine();

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (c == '(' || c == '{' || c == '[')
				st.push(c);

			else if (c == ')' || c == '}' || c == ']') {
				if (st.empty()) {
					System.out.println("false");
					return;
				} else {
					if (compare(st.peek(), c) == false) {
						System.out.println("false");
						return;
					} else {
						st.pop();
					}
				}
			}
		}
		if (st.empty())
			System.out.println("true");
		else
			System.out.println("false");
	}

	static boolean compare(char c1, char c2) {
		return ((c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}') || (c1 == '(' && c2 == ')'));
	}
}
