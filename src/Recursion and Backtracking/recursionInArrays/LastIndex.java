package recursionInArrays;

import java.util.*;

public class LastIndex {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        arr[i] = scn.nextInt();
        int x = scn.nextInt();
        int last = lastIndex(arr,0,x);
        System.out.println(last);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        int last = lastIndex(arr,idx+1,x);
        if(last!=-1){
            return last;
        }else if(arr[idx]==x){
            return idx;
        }else{
            return -1;
        }
    }

}