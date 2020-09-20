package introductionToRecursion;

import java.util.Scanner;

public class PowerLogarithmic {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int temp = power(x,n/2);
        int ans = temp * temp;
        if(n%2==1){
            ans *= x;
        }
        return ans;
    }

}