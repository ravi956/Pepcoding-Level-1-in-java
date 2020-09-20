package recursionWithArraylist;

import java.util.*;

public class GetKpc {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList < String > res = getKPC(str);
        System.out.println(res);
    }

    static String[] key = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList < String > getKPC(String str) {
        
        if (str.length() == 0) {
            ArrayList < String > bexp = new ArrayList < > ();
            bexp.add("");
            return bexp;
        }
        
        char ch = str.charAt(0);
        ArrayList < String > faith = getKPC(str.substring(1));
        ArrayList < String > exp = new ArrayList < > ();
        
        String codeforch = key[ch-'0'];
        for(int j=0; j<codeforch.length(); j++){
            char c = codeforch.charAt(j);
            for(String s : faith){
                exp.add(c+s);
            }
        }
        return exp;
    }
}