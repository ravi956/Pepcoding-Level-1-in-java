package dynamicProgrammingAndGreedy;

import java.util.*;

public class CountBinaryStrings {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
//		int[] dp0 = new int[n+1];
//		int[] dp1 = new int[n+1];
//		
//		dp0[1] = 1;
//		dp1[1] = 1;
//		
//		for(int i=2; i<=n; i++) {
//			dp0[i] = dp1[i-1];
//			dp1[i] = dp0[i-1] + dp1[i-1];
//		}
//		System.out.println(dp0[n]+dp1[n]);
		
		int oczeros = 1;
		int ocones = 1;
		
		for(int i=2; i<=n; i++) {
			int nczeros = ocones;
			int ncones = oczeros + ocones;
			oczeros = nczeros;
			ocones = ncones;
		}
		System.out.println(oczeros + ocones);
	}

}