package gettingStarted;

import java.util.*;
  
  public class PrintFibonacciNumbersTillN{
  
  public static void main(String[] args) {
      
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      if(n==1)
      System.out.println(0);
      else if(n==2)
      System.out.println("0\n1");
      else
      {
          int a= 0;
          int b= 1;
          System.out.println("0\n1");
          for(int i=3; i<=n; i++)
          {
              int c = b+a;
              System.out.println(c);
              a=b;
              b=c;
          }
      }
   }
  }