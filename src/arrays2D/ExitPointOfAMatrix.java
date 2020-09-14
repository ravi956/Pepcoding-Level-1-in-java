package arrays2D;

import java.util.Scanner;

public class ExitPointOfAMatrix {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++)
				arr[i][j] = scn.nextInt();
		}
		char move;
		if(arr[0][0]==0)
			move = 'R';
		else
			move = 'D';
		int i=0, j=0;
		while(true) {
			if(arr[i][j]==1) {
				if(move == 'D')
					move = 'L';
				else if(move == 'U')
					move = 'R';
				else if(move == 'R')
					move = 'D';
				else if(move == 'L')
					move = 'U';
			}
			switch(move) {
			case 'D' : i++; break;
			case 'U' : i--; break;
			case 'R' : j++; break;
			case 'L' : j--; break;
			}
			if(i==n) {
				i--; break;
			} else if(j==m) {
				j--; break;
			} else if(i==-1) {
				i++; break;
			} else if(j==-1) {
				j++; break;
			}
		}
		System.out.println(i);
		System.out.println(j);
	}
}
