package functionAndArrays;

import java.util.*;

public class FirstIndexAndLastIndex{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++)
    arr[i] = scn.nextInt();
    int d = scn.nextInt();
    
    int first=-1;
    int low = 0;
    int high = n-1;
    while(low<=high){
        int mid = (low+high)/2;
        if(d>arr[mid]){
            low = mid+1;
        }else if(d<arr[mid]){
            high= mid-1;
        }else{
            if(mid==0 || arr[mid-1]!=d){
                first=mid;
                break;
            }else{
                high=mid-1;
            }
        }
    }
    
    int last = -1;
    low = first;
    high = n-1;
    while(low<=high){
        int mid = (low+high)/2;
        if(d>arr[mid]){
            low = mid+1;
        }else if(d<arr[mid]){
            high= mid-1;
        }else{
            if(mid==n-1 || arr[mid+1]!=d){
                last=mid;
                break;
            }else{
                low=mid+1;
            }
        }
    }
    System.out.println(first);
    System.out.println(last);
 }

}