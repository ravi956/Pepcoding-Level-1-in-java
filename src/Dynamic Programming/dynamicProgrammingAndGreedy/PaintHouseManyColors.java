package dynamicProgrammingAndGreedy;

import java.util.*;

public class PaintHouseManyColors {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int c = scn.nextInt();

		int[][] arr = new int[n][c];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

		int[][] dp = new int[n][c];

		int least1 = Integer.MAX_VALUE;
		int least2 = Integer.MAX_VALUE;

		for (int j = 0; j < dp[0].length; j++) {
			dp[0][j] = arr[0][j];

			if (dp[0][j] <= least1) {
				least2 = least1;
				least1 = dp[0][j];
			} else if (dp[0][j] <= least2) {
				least2 = dp[0][j];
			}
		}

		for (int i = 1; i < dp.length; i++) {
			int nleast1 = Integer.MAX_VALUE;
			int nleast2 = Integer.MAX_VALUE;
			for (int j = 0; j < dp[0].length; j++) {
				int mn = (dp[i - 1][j] != least1) ? least1 : least2;

				dp[i][j] = arr[i][j] + mn;

				if (dp[i][j] <= nleast1) {
					nleast2 = nleast1;
					nleast1 = dp[i][j];
				} else if (dp[i][j] <= nleast2) {
					nleast2 = dp[i][j];
				}
			}
			least1 = nleast1;
			least2 = nleast2;
		}
		
		System.out.println(least1);
	}
}