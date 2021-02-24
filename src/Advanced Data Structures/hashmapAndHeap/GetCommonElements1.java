package hashmapAndHeap;

import java.util.*;

public class GetCommonElements1 {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner scn = new Scanner(System.in);

		int n1 = scn.nextInt();
		HashMap<Integer, Boolean> hm = new HashMap<>();

		for (int i = 0; i < n1; i++) {
			int a = scn.nextInt();
			hm.put(a, false);
		}

		int n2 = scn.nextInt();
		for (int i = 0; i < n2; i++) {
			int a = scn.nextInt();
			if (hm.containsKey(a)) {
				if (hm.get(a) == false) {
					System.out.println(a);
					hm.put(a, true);
				}
			}
		}
	}

}