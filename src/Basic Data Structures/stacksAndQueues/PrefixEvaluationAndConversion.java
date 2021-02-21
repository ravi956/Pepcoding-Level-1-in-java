package stacksAndQueues;

import java.io.*;
import java.util.*;

public class PrefixEvaluationAndConversion {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> pre = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        
        for (int i = exp.length()-1; i >= 0; i--) {
			char ch = exp.charAt(i);

			if (Character.isDigit(ch)) {
				pre.push(ch - '0');
				infix.push(ch + "");
				postfix.push(ch + "");
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				int val1 = pre.pop();
				int val2 = pre.pop();
				int val = operation(val1, val2, ch);
				pre.push(val);

				String s1 = infix.pop();
				String s2 = infix.pop();
				String s = '(' + s1 + ch + s2 + ')';
				infix.push(s);

				s1 = postfix.pop();
				s2 = postfix.pop();
				s = s1 + s2 + ch;
				postfix.push(s);
			}
		}

		System.out.println(pre.pop());
		System.out.println(infix.pop());
		System.out.println(postfix.pop());
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