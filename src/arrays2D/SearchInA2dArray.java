package arrays2D;

import java.util.Scanner;

public class SearchInA2dArray {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++)
				arr[i][j] = scn.nextInt();
		}
		int x = scn.nextInt();
		search(arr,x);
	}
	
	public static void search(int[][] arr, int x) {
		int n = arr.length;
		if(x<arr[0][0] || x>arr[n-1][n-1]) {
			System.out.println("Not Found");
			return;
		}
		int i=0, j=n-1;
		while(i<n && j>=0) {
			if(x==arr[i][j]) {
				System.out.println(i);
				System.out.println(j);
				return;
			}else if(x<arr[i][j]) {
				j--;
			}else {
				i++;
			}
		}
		System.out.println("Not Found");
	}
}
