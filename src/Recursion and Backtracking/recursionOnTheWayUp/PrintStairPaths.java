package recursionOnTheWayUp;

import java.util.*;

public class PrintStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        printStairPaths(n,"");
    }

    public static void printStairPaths(int n, String path) {
        if(n==0){
            System.out.println(path);
            return;
        }else if(n<0){
            return;
        }
        
        printStairPaths(n-1,path+"1");
        printStairPaths(n-2,path+"2");
        printStairPaths(n-3,path+"3");
    }

}