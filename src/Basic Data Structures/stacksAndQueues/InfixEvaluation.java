package stacksAndQueues;

import java.util.*;
import java.io.*;

public class InfixEvaluation {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String exp = br.readLine();

		// code
		Stack<Integer> opd = new Stack<>();
		Stack<Character> opt = new Stack<>();

		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);

			if (ch == '(') {
				opt.push(ch);
			} else if (Character.isDigit(ch)) {
				opd.push(ch - '0');
			} else if (ch == ')') {
				while (opt.peek() != '(') {
					int a = opd.pop();
					int b = opd.pop();
					char op = opt.pop();
					int val = operation(b, a, op);
					opd.push(val);
				}
				opt.pop();
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				while (opt.empty() == false && opt.peek() != '(' && precedence(opt.peek()) >= precedence(ch)) {
					int a = opd.pop();
					int b = opd.pop();
					char op = opt.pop();
					int val = operation(b, a, op);
					opd.push(val);
				}
				opt.push(ch);
			}
		}

		while (!opt.empty()) {
			int a = opd.pop();
			int b = opd.pop();
			char op = opt.pop();
			int val = operation(b, a, op);
			opd.push(val);
		}

		System.out.println(opd.peek());
	}

	public static int precedence(char optor) {
		if (optor == '+' || optor == '-') {
			return 1;
		} else {
			return 2;
		}
	}

	public static int operation(int val1, int val2, char op) {
		if (op == '+') {
			return val1 + val2;
		} else if (op == '-') {
			return val1 - val2;
		} else if (op == '*') {
			return val1 * val2;
		} else {
			return val1 / val2;
		}
	}
}
