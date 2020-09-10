package patterns;

import java.util.*;

public class Pattern16 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = 2 * n - 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + "	");
            for (int j = 1; j <= space; j++)
                System.out.print("	");
            for (int j = i; j >= 1; j--)
                if (j != n)
                    System.out.print(j + "	");
            System.out.println();
            space -= 2;
        }
    }
}
