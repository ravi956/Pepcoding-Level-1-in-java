package dynamicProgrammingAndGreedy;

import java.util.*;

public class BuyAndSellStocksWithTransactionFee {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] prices = new int[n];
		for(int i=0; i<n; i++) {
			prices[i] = scn.nextInt();
		}
		int fee = scn.nextInt();
		
		//bsp -> boughtStateProfit i.e one stock is in hand
		//ssp -> soldStateProfit i.e no stock is in hand
		int bsp = -prices[0];
		int ssp = 0;
		
		for(int i=1; i<prices.length; i++) {
			int newbsp = Math.max(bsp, ssp-prices[i]);
			int newssp = Math.max(ssp, prices[i]+bsp-fee);
			bsp = newbsp;
			ssp = newssp;
		}
		System.out.println(ssp);
	}

}
