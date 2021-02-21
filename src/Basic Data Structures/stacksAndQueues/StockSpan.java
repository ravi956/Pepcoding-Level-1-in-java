package stacksAndQueues;

import java.io.*;
import java.util.*;

public class StockSpan {
	public static void display(int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int val : a) {
			sb.append(val + "\n");
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		int[] span = solve(a);
		display(span);
	}

	public static int[] solve(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int[] span = new int[arr.length];
	    span[0] = 1;
	    s.push(0);

	    for (int i = 1; i < arr.length; i++)
	    {
	        while (s.empty() == false && arr[s.peek()] <= arr[i])
	            s.pop();

	        span[i] = s.empty() ? i + 1 : i - s.peek();

	        s.push(i);
	    }
	    return span;
	}

}