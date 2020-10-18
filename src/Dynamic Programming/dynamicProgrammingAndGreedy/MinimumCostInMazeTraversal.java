package dynamicProgrammingAndGreedy;

import java.util.*;

public class MinimumCostInMazeTraversal {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

		int minCP = minCostPath(arr);
		System.out.println(minCP);
	}

	public static int minCostPath(int[][] arr) {
		int[][] dp = new int[arr.length][arr[0].length];
		
		for(int i=dp.length-1; i>=0; i--) {
			for(int j=dp[0].length-1; j>=0; j--) {
				if(i==dp.length-1 && j==dp[0].length-1) {
					dp[i][j] = arr[i][j];
				}else if(i==dp.length-1) {
					dp[i][j] = arr[i][j] + dp[i][j+1];
				}else if(j==dp[0].length-1) {
					dp[i][j] = arr[i][j] + dp[i+1][j];
				}else {
					dp[i][j] = arr[i][j] + Math.min(dp[i][j+1], dp[i+1][j]);
				}
			}
		}
		return dp[0][0];
	}

}