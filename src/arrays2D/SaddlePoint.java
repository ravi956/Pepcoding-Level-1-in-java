package arrays2D;

import java.util.Scanner;

public class SaddlePoint {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				arr[i][j] = scn.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			int svj = 0;
			for(int j=1; j<n; j++) {
				if(arr[i][j]<arr[i][svj])
					svj=j;
			}
			boolean flag = true;
			for(int row=0; row<n; row++) {
				if(arr[row][svj]>arr[i][svj]) {
					flag =false;
					break;
				}
			}
			if(flag==true) {
				System.out.println(arr[i][svj]);
				return;
			}
		}
		System.out.println("Invalid input");
	}
}
