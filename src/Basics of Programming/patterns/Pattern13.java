package patterns;

import java.util.*;
public class Pattern13{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(fact(i)/(fact(j)*fact(i-j)) + "	");
            }
            System.out.println();
        }
    }
    
    static int fact(int n)
    {
        if(n<=1)
        return 1;
        return n*fact(n-1);
    }
}
