package recursionInArrays;

import java.util.*;

public class MaxOfAnArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        arr[i] = scn.nextInt();
        int max = maxOfArray(arr,0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[arr.length-1];
        }
        int max1 = maxOfArray(arr,idx+1);
        if(arr[idx]>max1)
        return arr[idx];
        else
        return max1;
    }

}