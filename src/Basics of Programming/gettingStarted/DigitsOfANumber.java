package gettingStarted;

import java.util.*;
    
    public class DigitsOfANumber{
    
    public static void main(String[] args) {
      
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      PrintDigits(n);
     }
     
    public static void PrintDigits(int n)
    {
        if(n<10)
        {
            System.out.println(n);
            return;
        }
        int lastDigit = n%10;
        PrintDigits(n/10);
        System.out.println(lastDigit);
    }
    }