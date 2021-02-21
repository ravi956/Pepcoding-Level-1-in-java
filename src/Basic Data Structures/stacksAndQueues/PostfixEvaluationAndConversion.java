package stacksAndQueues;

import java.io.*;
import java.util.*;

public class PostfixEvaluationAndConversion {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String exp = br.readLine();

		// code

		Stack<Integer> post = new Stack<>();
		Stack<String> infix = new Stack<>();
		Stack<String> prefix = new Stack<>();

		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);

			if (Character.isDigit(ch)) {
				post.push(ch - '0');
				infix.push(ch + "");
				prefix.push(ch + "");
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				int val2 = post.pop();
				int val1 = post.pop();
				int val = operation(val1, val2, ch);
				post.push(val);

				String s2 = infix.pop();
				String s1 = infix.pop();
				String s = '(' + s1 + ch + s2 + ')';
				infix.push(s);

				s2 = prefix.pop();
				s1 = prefix.pop();
				s = ch + s1 + s2;
				prefix.push(s);
			}
		}

		System.out.println(post.pop());
		System.out.println(infix.pop());
		System.out.println(prefix.pop());
	}

	public static int operation(int val1, int val2, char ch) {
		if (ch == '+') {
			return val1 + val2;
		} else if (ch == '-') {
			return val1 - val2;
		} else if (ch == '*') {
			return val1 * val2;
		} else {
			return val1 / val2;
		}
	}
}