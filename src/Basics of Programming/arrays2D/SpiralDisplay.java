package arrays2D;

import java.util.Scanner;

public class SpiralDisplay {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				arr[i][j] = scn.nextInt();
		}
		print(arr, n, m);
	}

	static void print(int arr[][], int n, int m) {
		int top = 0, right = m - 1, bottom = n - 1, left = 0;
		int total = n * m;
		int count = 0;
		while (count < total) {
			for (int j = left, i = top; i <= bottom && count < total; i++) {
				System.out.println(arr[i][j]);
				count++;
			}
			left++;
			for (int i = bottom, j = left; j <= right && count < total; j++) {
				System.out.println(arr[i][j]);
				count++;
			}
			bottom--;
			for (int j = right, i = bottom; i >= top && count < total; i--) {
				System.out.println(arr[i][j]);
				count++;
			}
			right--;
			for (int i = top, j = right; j >= left && count < total; j--) {
				System.out.println(arr[i][j]);
				count++;
			}
			top++;
		}
	}
}
