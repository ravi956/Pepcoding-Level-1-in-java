package patterns;

import java.util.*;

public class Pattern18{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int os = 0;
    int star = n;
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=os; j++)
        System.out.print("	");
        for(int j=1; j<=star; j++)
        {
            if(j>1 && j<star && i>1 && i<=n/2)
            System.out.print("	");
            else
            System.out.print("*	");
        }
        if(i<=n/2)
        {
            os++;
            star-=2;
        }else{
            os--;
            star+=2;
        }
        System.out.println();
    }

 }
}
