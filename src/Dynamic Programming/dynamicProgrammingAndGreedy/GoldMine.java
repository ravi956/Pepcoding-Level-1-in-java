package dynamicProgrammingAndGreedy;

import java.util.*;

public class GoldMine {

    public static void main(String[] args) throws Exception {
        // write your code here
    	Scanner scn = new Scanner(System.in);
    	int n = scn.nextInt();
    	int m = scn.nextInt();
    	
    	int[][] arr = new int[n][m];
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<m; j++) {
    			arr[i][j] = scn.nextInt();
    		}
    	}
    	
    	int[][] dp = new int[n][m];
    	for (int j = m - 1; j >= 0; j--)
        {
            for (int i = 0; i < n; i++)
            {
                if (j == m - 1)
                    dp[i][j] = arr[i][j];
                else if (i == 0)
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
                else if (i == n - 1)
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
                else
                    dp[i][j] = arr[i][j] + Math.max(dp[i - 1][j + 1], Math.max(dp[i][j + 1], dp[i + 1][j + 1]));
            }
        }
    	
    	int maxGold = Integer.MIN_VALUE;
        for (int i = 0, j = 0; i < n; i++)
            maxGold = Math.max(maxGold, dp[i][j]);
        
        System.out.println(maxGold);
    }

}