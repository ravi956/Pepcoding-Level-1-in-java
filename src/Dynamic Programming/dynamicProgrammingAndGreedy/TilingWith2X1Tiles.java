package dynamicProgrammingAndGreedy;

import java.util.*;

public class TilingWith2X1Tiles {

    public static void main(String[] args) throws Exception {
    	Scanner scn = new Scanner(System.in);
    	int n = scn.nextInt();
    	
    	int[] dp = new int[n+1];
    	dp[0] = 0;
    	dp[1] = 1;
    	dp[2] = 2;
    	
    	for(int i=3; i<=n; i++) {
    		dp[i] = dp[i-1] + dp[i-2];
    	}
    	
    	System.out.println(dp[n]);
    }
}