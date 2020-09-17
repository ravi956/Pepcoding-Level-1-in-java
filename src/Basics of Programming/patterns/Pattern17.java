package patterns;

import java.util.*;

public class Pattern17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n / 2; j++) {
                if (i != n / 2 + 1)
                    System.out.print("	");
                else
                    System.out.print("*	");
            }
            for (int j = 1; j <= star; j++)
                System.out.print("*	");
            if (i <= n / 2)
                star++;
            else
                star--;
            System.out.println();
        }
    }
}
