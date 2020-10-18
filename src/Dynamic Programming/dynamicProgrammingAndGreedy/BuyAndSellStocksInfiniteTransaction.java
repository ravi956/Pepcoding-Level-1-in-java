package dynamicProgrammingAndGreedy;

import java.util.Scanner;

public class BuyAndSellStocksInfiniteTransaction {
	public static void main(String[] args) throws Exception {
        // write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int[] prices = new int[n];
		for(int i=0; i<prices.length; i++) {
			prices[i] = scn.nextInt();
		}
		
		int totalProfit = 0;
		int bd = 0;
		int sd = 0;
		
		for(int i=1; i<prices.length; i++) {
			if(prices[i]>= prices[i-1]) {
				sd++;
			}else {
				totalProfit += prices[sd] - prices[bd];
				bd = sd = i;
			}
		}
		
		totalProfit += prices[sd] - prices[bd];
		
		System.out.println(totalProfit);
    }
}
