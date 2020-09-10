package gettingStarted;

import java.util.*;
  
  public class PythagoreanTriplet{
  
  public static void main(String[] args) {
      
      Scanner scn = new Scanner(System.in);
      long a = scn.nextLong();
      long b = scn.nextLong();
      long c = scn.nextLong();
      a = a*a;
      b = b*b;
      c = c*c;
      if( (a==b+c) || (b==a+c) || (c==a+b) )
      System.out.println("true");
      else
      System.out.println("false");
   }
  }