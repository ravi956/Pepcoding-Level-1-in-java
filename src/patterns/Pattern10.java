package patterns;

import java.util.*;

public class Pattern10{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int pos1 = n/2+1;
    int pos2 = pos1;
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            if(j==pos1 || j==pos2)
            System.out.print("*	");
            else
            System.out.print("	");
        }
        if(i<=n/2)
        {
            pos1--;
            pos2++;
        }
        else
        {
            pos1++;
            pos2--;
        }
        System.out.println();
    }
 }
}
