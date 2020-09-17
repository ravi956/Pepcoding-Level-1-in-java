package functionAndArrays;

import java.util.*;

public class AnyBaseToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int decimal = sourceBaseToDecimal(n,sourceBase);
        int result = decimalToDestBase(decimal, destBase);
        System.out.println(result);
    }

    public static int sourceBaseToDecimal(int n, int b1) {
        int res = 0;
        int mult = 1;
        while (n != 0) {
            res += (n % 10) * mult;
            mult *= b1;
            n /= 10;
        }
        return res;
    }
    public static int decimalToDestBase(int n, int b2) {
        int res = 0;
        int mult = 1;
        while (n != 0) {
            res += (n % b2) * mult;
            mult *= 10;
            n /= b2;
        }
        return res;
    }
}
