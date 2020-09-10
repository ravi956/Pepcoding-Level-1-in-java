package functionAndArrays;

import java.util.*;

public class AnyBaseToDecimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        int res = 0;
        int mult = 1;
        while (n != 0) {
            res += (n % 10) * mult;
            mult *= b;
            n /= 10;
        }
        return res;
    }
}
