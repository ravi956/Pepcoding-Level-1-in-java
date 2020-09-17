package patterns;

import java.util.*;

public class Pattern15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n/2;
        int star = 1;
        int start =1;
        for(int i=1; i<=n; i++)
        {
            int add = 0;
            for(int j=1; j<=space; j++)
            System.out.print("	");
            for(int j=1; j<=star; j++)
            {
                System.out.print((start+add)+"	");
                if(j<=star/2)
                add++;
                else
                add--;
            }
            if(i<=n/2)
            {
                space--;
                star+=2;
                start++;
            }
            else
            {
                space++;
                star-=2;
                start--;
            }
            System.out.println();
        }
    }
}
