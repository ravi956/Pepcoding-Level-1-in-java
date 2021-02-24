package hashmapAndHeap;

import java.util.*;

public class GetCommonElements2 {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner scn = new Scanner(System.in);

		int n1 = scn.nextInt();
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < n1; i++) {
			int a = scn.nextInt();
			if (hm.containsKey(a)) {
				int val = hm.get(a);
				hm.put(a, val + 1);
			} else {
				hm.put(a, 1);
			}
		}

		int n2 = scn.nextInt();
		for (int i = 0; i < n2; i++) {
			int a = scn.nextInt();
			if (hm.containsKey(a)) {
				int val = hm.get(a);
				if (val > 0) {
					System.out.println(a);
					hm.put(a, val - 1);
				} else {
					hm.remove(a);
				}
			}
		}
	}

}