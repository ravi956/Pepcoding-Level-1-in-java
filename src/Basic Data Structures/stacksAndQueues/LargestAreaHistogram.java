package stacksAndQueues;

import java.io.*;
import java.util.*;

public class LargestAreaHistogram {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		// rb -> right boundry -> next smallest element on right
		int[] rb = new int[a.length];
		Stack<Integer> st = new Stack<>();
		rb[a.length - 1] = a.length;
		st.push(a.length - 1);

		for (int i = a.length - 2; i >= 0; i--) {
			while (st.empty() == false && a[st.peek()] >= a[i]) {
				st.pop();
			}

			rb[i] = st.empty() ? a.length : st.peek();
			st.push(i);
		}

		// lb -> left boundry -> next smallest element on left
		int[] lb = new int[a.length];
		st = new Stack<>();
		lb[0] = -1;
		st.push(0);

		for (int i = 1; i < a.length; i++) {
			while (st.empty() == false && a[st.peek()] >= a[i]) {
				st.pop();
			}

			lb[i] = st.empty() ? -1 : st.peek();
			st.push(i);
		}

		// area
		int maxArea = 0;
		for (int i = 0; i < a.length; i++) {
			int width = rb[i] - lb[i] - 1;
			int area = a[i] * width;
			maxArea = Math.max(maxArea, area);
		}

		System.out.println(maxArea);
	}
}