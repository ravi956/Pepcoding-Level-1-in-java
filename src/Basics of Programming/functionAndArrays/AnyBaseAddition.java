package functionAndArrays;

import java.util.*;

public class AnyBaseAddition {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {
        int sum = 0;
        int carry = 0;
        int mult = 1;
        while (n1 > 0 || n2 > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            int c = (d1 + d2 + carry);
            sum += (c % b) * mult;
            carry = c / b;
            mult *= 10;
            n1 /= 10;
            n2 /= 10;
        }
        sum += carry * mult;
        return sum;
    }
}
//It can also be solved by converting into decimal, performing sum and then converting 
//again into the given base
