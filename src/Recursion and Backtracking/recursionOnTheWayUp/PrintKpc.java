package recursionOnTheWayUp;

import java.util.*;

public class PrintKpc {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printKPC(str,"");
    }
    
    static String[] key = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static void printKPC(String ques, String ans) {
        
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        
        char ch = ques.charAt(0);
        String s = key[ch-'0'];
        String ros = ques.substring(1);
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            printKPC(ros,ans+c);
        }
        
    }

}