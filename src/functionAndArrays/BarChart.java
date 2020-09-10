package functionAndArrays;

import java.util.*;

public class BarChart {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            if(arr[i]>maximum)
            maximum = arr[i];
        }
        for(int i=maximum; i>=1; i--)
        {
            for(int j=0; j<n; j++)
            {
                if(arr[j]>=i)
                System.out.print("*\t");
                else
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}