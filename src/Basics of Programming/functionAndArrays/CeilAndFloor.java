package functionAndArrays;

import java.util.*;

public class CeilAndFloor{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++)
    arr[i] = scn.nextInt();
    int d = scn.nextInt();
    
    int low=0;
    int high=n-1;
    while(low<=high){
        int mid = (low + high)/2;
        if(d==arr[mid]){
            System.out.println(d + "\n" + d);
            break;
        }else if(d<arr[mid]){
            if(d>arr[mid-1]){
                System.out.println(arr[mid] + "\n" + arr[mid-1] );
                break;
            }else{
                high=mid-1;
            }
        }else{
            if(d<arr[mid+1]){
                System.out.println(arr[mid+1]+ "\n" +arr[mid] );
                break;
            }else{
                low=mid+1;
            }
        }
    }
 }

}