package gettingStarted;

import java.util.*;

public class RotateANumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int nod = 0;
        int temp = n;
        while (temp > 0) {
            nod++;
            temp /= 10;
        }
        k = k%nod;
        if(k<0){
            k+=nod;
        }
        int div=1;
        int mult=1;
        for(int i=1; i<=nod; i++)
        {
            if(i<=k){
                div*=10;
            }else{
                mult*=10;
            }
        }
        int q = n/div;
        int r = n%div;
        int ans = r*mult + q;
        System.out.println(ans);
    }
}