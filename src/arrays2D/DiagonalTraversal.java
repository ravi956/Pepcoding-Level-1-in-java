package arrays2D;

import java.util.Scanner;

public class DiagonalTraversal {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				arr[i][j] = scn.nextInt();
		}
		int minr=0, minc=0, maxr=n-1, maxc=n-1;
		while(minc<n) {
			int i=minr, j=minc;
			while(i<=maxr && j<=maxc) {
				System.out.println(arr[i][j]);
				i++;
				j++;
			}
			minc++;
			maxr--;
		}
	}
}
