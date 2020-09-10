package functionAndArrays;

import java.io.*;

public class RotateAnArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
    int n = a.length;
    k = k%n;
    int start = (k>=0)?n-k:-k;
    start %= n;
    int[] temp = new int[n];
    for(int i=0; i<n; i++)
    {
        temp[i] = a[start];
        start = (start+1)%n;
    }
    for(int i=0; i<n; i++)
    a[i] = temp[i];
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}

//It can also be solved by reversing the two parts of the array individually and then
//reverse the whole array this will reverse the array group wise
