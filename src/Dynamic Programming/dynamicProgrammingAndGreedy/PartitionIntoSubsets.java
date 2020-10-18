package dynamicProgrammingAndGreedy;

import java.util.Scanner;

public class PartitionIntoSubsets {
	public static void main(String[] args) throws Exception {
        // write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		
		int[][] dp = new int[n+1][k+1];
		dp[0][0] = 1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=k; j++) {
				dp[i][j] = j*dp[i-1][j] + dp[i-1][j-1];
			}
		}
		
		System.out.println(dp[n][k]);
    }
}
