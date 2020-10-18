package dynamicProgrammingAndGreedy;

import java.util.Scanner;

public class BuyAndSellStocksOneTransactionAllowed {
	public static void main(String[] args) throws Exception {
        // write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int[] prices = new int[n];
		for(int i=0; i<prices.length; i++) {
			prices[i] = scn.nextInt();
		}
		
		int lsf = Integer.MAX_VALUE;
		int maxProfit = 0;
		int profitToday = 0;
		
		for(int i=0; i<prices.length; i++) {
			lsf = Math.min(lsf, prices[i]);
			profitToday = prices[i] - lsf;
			maxProfit = Math.max(maxProfit, profitToday);
		}
		
		System.out.println(maxProfit);
    }
}
