package recursionWithArraylist;

import java.util.*;

public class GetMazePathWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> res = getMazePaths(1,1,n,m);
        System.out.println(res);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
    	if(sr==dr && sc==dc) {
    		ArrayList<String> bpath = new ArrayList<>();
    		bpath.add("");
    		return bpath;
    	}
    	
    	ArrayList<String> paths = new ArrayList<>();
    	
    	//horizontal moves
    	for(int ms=1; ms<=dc-sc; ms++) {
    		ArrayList<String> hpaths = getMazePaths(sr,sc+ms,dr,dc);
    		for(String hpath : hpaths) {
    			paths.add("h" + ms + hpath);
    		}
    	}
    	
    	//vertical moves
    	for(int ms=1; ms<=dr-sr; ms++) {
    		ArrayList<String> vpaths = getMazePaths(sr+ms,sc,dr,dc);
    		for(String vpath : vpaths) {
    			paths.add("v" + ms + vpath);
    		}
    	}
    	
    	//diagonal moves
    	int maxDmoves = (dc-sc)<(dr-sr) ? (dc-sc) : (dr-sr);
    	for(int ms=1; ms<=maxDmoves; ms++) {
    		ArrayList<String> dpaths = getMazePaths(sr+ms,sc+ms,dr,dc);
    		for(String dpath : dpaths) {
    			paths.add("d" + ms + dpath);
    		}
    	}
    	return paths;
    }

}