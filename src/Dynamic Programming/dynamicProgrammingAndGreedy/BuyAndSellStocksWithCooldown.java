package dynamicProgrammingAndGreedy;

import java.util.*;

public class BuyAndSellStocksWithCooldown {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] prices = new int[n];
		for(int i=0; i<n; i++) {
			prices[i] = scn.nextInt();
		}
		
		//bsp -> boughtStateProfit i.e one stock is in hand
		//ssp -> soldStateProfit i.e no stock is in hand
		//csp -> cooldownStateProfit i.e no stock in hand and one day gap after selling
		int bsp = -prices[0];
		int ssp = 0;
		int csp = 0;
		
		for(int i=1; i<prices.length; i++) {
			int newbsp = Math.max(bsp, csp-prices[i]);
			int newssp = Math.max(ssp, bsp+prices[i]);
			int newcsp = Math.max(csp, ssp);
			bsp = newbsp;
			ssp = newssp;
			csp = newcsp;
		}
		System.out.println(ssp);
	}

}