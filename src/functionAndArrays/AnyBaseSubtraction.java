package functionAndArrays;

import java.util.*;

public class AnyBaseSubtraction {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {
        int difference = 0;
        int carry = 0;
        int mult = 1;
        while (n1 > 0 || n2 > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            int c = (d2 - d1 + carry);
            if(c<0)
            {
                c += b;
                carry = -1;
            }
            else
            carry = 0;
            difference += c * mult;
            mult *= 10;
            n1 /= 10;
            n2 /= 10;
        }
        return difference;
    }

}
