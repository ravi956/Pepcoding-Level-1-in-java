package gettingStarted;

import java.util.*;

public class InverseOfANumber{

public static void main(String[] args) {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int answer = 0;
    int base = 1;
    while(n>0)
    {
        answer += (int)Math.pow(10,(n%10)-1) * base;
        base++;
        n/=10;
    }
    System.out.println(answer);
 }
}