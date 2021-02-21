package stacksAndQueues;

import java.io.*;
import java.util.*;

public class CelebrityProblem {

	public static void main(String[] args) throws Exception {
		// write your code here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];

		for (int j = 0; j < n; j++) {
			String line = br.readLine();
			for (int k = 0; k < n; k++) {
				arr[j][k] = line.charAt(k) - '0';
			}
		}

		findCelebrity(arr);

	}

	public static void findCelebrity(int[][] arr) {
		// if a celebrity is there print it's index (not position), if there is not then
		// print "none"
		Stack<Integer> celeb = new Stack<>();
		celeb.push(0);

		for (int i = 1; i < arr.length; i++) {
			int p1 = celeb.pop();
			int p2 = i;
			if (arr[p1][p2] == 1) {
				celeb.push(p2);
			} else {
				celeb.push(p1);
			}
		}

		int celebCandi = celeb.pop();
		for (int i = 0; i < arr.length; i++) {
			if (i != celebCandi) {
				if (arr[celebCandi][i] == 1 || arr[i][celebCandi] == 0) {
					System.out.println("none");
					return;
				}
			}
		}
		System.out.println(celebCandi);
	}

}