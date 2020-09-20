package recursionWithArraylist;

import java.util.*;

public class GetMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> res = getMazePaths(1,1,n,m);
        System.out.println(res);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> bpath = new ArrayList<>();
            bpath.add("");
            return bpath;
        }
        ArrayList<String> hpath = new ArrayList<>();
        ArrayList<String> vpath = new ArrayList<>();
        
        if(sc<dc){
            hpath = getMazePaths(sr,sc+1,dr,dc);
        }
        if(sr<dr){
            vpath = getMazePaths(sr+1,sc,dr,dc);
        }
        ArrayList<String> path = new ArrayList<>();
        
        for(String s : hpath){
            path.add('h'+s);
        }
        for(String s : vpath){
            path.add('v'+s);
        }
        return path;
    }

}