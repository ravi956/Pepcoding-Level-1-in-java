package gettingStarted;

import java.util.Scanner;

public class PrintAllPrimesTillN{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for(int i=low; i<=high; i++)
        {
            boolean flag = true;
            for(int j=2; j*j<=i; j++)
            {
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            System.out.println(i);
        }
        
    }
}