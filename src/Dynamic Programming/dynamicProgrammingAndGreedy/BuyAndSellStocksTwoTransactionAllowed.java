package dynamicProgrammingAndGreedy;

import java.util.*;

public class BuyAndSellStocksTwoTransactionAllowed {

    public static void main(String[] args) throws Exception {
        // write your code here
    	Scanner scn = new Scanner(System.in);
    	int n = scn.nextInt();
    	int[] prices = new int[n];
    	for(int i=0; i<prices.length; i++) {
    		prices[i] = scn.nextInt();
    	}
    	
    	//mpist -> max profit if sold today
    	//lsf -> least so far
    	//dpl -> dp max profit if sold upto today (left side)
    	int mpist = 0;
    	int lsf = prices[0];
    	int[] dpl = new int[prices.length];
    	for(int i=1; i<prices.length; i++) {
    		lsf = Math.min(lsf, prices[i]);
    		mpist = prices[i] - lsf;
    		dpl[i] = Math.max(mpist, dpl[i-1]);
    	}
    	
    	//mpibt -> max profit if bought today
    	//maxat -> max after today
    	//dpr -> dp max profit if bought today or after (right side)
    	int mpibt = 0;
    	int maxat = prices[prices.length-1];
    	int[] dpr = new int[prices.length];
    	for(int i=prices.length-2; i>=0; i--) {
    		maxat = Math.max(maxat, prices[i]);
    		mpibt = maxat - prices[i];
    		dpr[i] = Math.max(mpibt, dpr[i+1]);
    	}
    	
    	int maxProfit = 0;
    	for(int i=0; i<prices.length; i++) {
    		maxProfit = Math.max(maxProfit, dpl[i]+dpr[i]);
    	}
    	System.out.println(maxProfit);
    }

}