package dynamicProgrammingAndGreedy;

import java.util.*;

public class UnboundedKnapsack {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] val = new int[n];
        for(int i=0; i<n; i++){
            val[i] = scn.nextInt();
        }
        int[] wts = new int[n];
        for(int i=0; i<n; i++){
            wts[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        
        int[] dp = new int[cap+1];
        
        for(int i=1; i<dp.length; i++){
            for(int j=0; j<n; j++){
                if(wts[j]<=i){
                    dp[i] = Integer.max(dp[i], dp[i-wts[j]]+val[j]);
                }
            }
        }
        System.out.println(dp[cap]);
    }
}