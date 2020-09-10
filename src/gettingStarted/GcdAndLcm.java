package gettingStarted;

import java.util.*;

public class GcdAndLcm {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        System.out.println(gcd(num1, num2));
        System.out.println(lcm(num1, num2));
    }

    public static int gcd(int a, int b) {
        if(b>a){
            int temp = a;
            a = b;
            b = temp;
        }
        if(a%b==0)
        return b;
        return gcd(b,a%b);
    }
    
    public static int lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }
}