package timeAndSpaceComplexity;

import java.util.*;

public class MergeTwoSortedArrays {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    //write your code here
    int[] arr = new int[a.length+b.length];
    int i=0, j=0, k=0;
    while(i<a.length && j<b.length){
        if(a[i]<=b[j]){
            arr[k++] = a[i++];
        }else{
            arr[k++] = b[j++];
        }
    }
    while(i<a.length){
        arr[k++] = a[i++];
    }
    while(j<b.length){
        arr[k++] = b[j++];
    }
    return arr;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}