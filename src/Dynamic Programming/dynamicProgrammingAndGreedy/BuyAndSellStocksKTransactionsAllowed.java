package dynamicProgrammingAndGreedy;

import java.util.*;

public class BuyAndSellStocksKTransactionsAllowed {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int k = scn.nextInt();

		int[][] dp = new int[k + 1][n];

		for (int t = 1; t <= k; t++) {
			int max = Integer.MIN_VALUE;
			for (int d = 1; d < n; d++) {
				max = Math.max(max, dp[t - 1][d - 1] - arr[d - 1]);
				dp[t][d] = Math.max(dp[t][d - 1], max + arr[d]);
			}
		}

		System.out.println(dp[k][n - 1]);
	}

}