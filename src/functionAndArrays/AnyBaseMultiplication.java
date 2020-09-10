package functionAndArrays;

import java.util.*;

public class AnyBaseMultiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        int m1 = sourceBaseToDecimal(n1,b);
        int m2 = sourceBaseToDecimal(n2,b);
        int product = m1*m2;
        return decimalToDestBase(product,b);
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