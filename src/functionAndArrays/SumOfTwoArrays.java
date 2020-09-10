package functionAndArrays;

import java.util.*;

public class SumOfTwoArrays{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    
    int n1 = scn.nextInt();
    int[] arr1 = new int[n1];
    for(int i=0; i<n1; i++)
    arr1[i] = scn.nextInt();
    
    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    for(int i=0; i<n2; i++)
    arr2[i] = scn.nextInt();
    
    int n = (n1>n2)?n1 : n2;
    int[] res = new int[n];
    n1--;
    n2--;
    n--;
    int carry = 0;
    while(n1>=0 && n2>=0){
        int d1 = arr1[n1--];
        int d2 = arr2[n2--];
        int c = d1 + d2 +carry ;
        res[n--] = c%10;
        carry = c/10;
    }
    while(n1>=0){
        int c = arr1[n1--] + carry;
        res[n--] = c%10;
        carry = c/10;
    }
    while(n2>=0){
        int c = arr2[n2--] + carry;
        res[n--] = c%10;
        carry = c/10;
    }
    if(carry!=0)
    System.out.println(carry);
    for(int val : res)
    System.out.println(val);
 }

}