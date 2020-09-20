package recursionWithArraylist;

import java.util.*;

public class GetStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList < String > res = getStairPaths(n);
        System.out.println(res);
    }

    public static ArrayList < String > getStairPaths(int n) {
        if (n == 0) {
            ArrayList < String > bres = new ArrayList < > ();
            bres.add("");
            return bres;
        } else if (n < 0) {
            ArrayList < String > bres = new ArrayList < > ();
            return bres;
        }

        ArrayList < String > prePath1 = getStairPaths(n - 1);
        ArrayList < String > prePath2 = getStairPaths(n - 2);
        ArrayList < String > prePath3 = getStairPaths(n - 3);
        ArrayList < String > mres = new ArrayList < > ();

        for (String s: prePath1) {
            mres.add("1" + s);
        }
        for (String s: prePath2) {
            mres.add("2" + s);
        }
        for (String s: prePath3) {
            mres.add("3" + s);
        }
        return mres;
    }

}