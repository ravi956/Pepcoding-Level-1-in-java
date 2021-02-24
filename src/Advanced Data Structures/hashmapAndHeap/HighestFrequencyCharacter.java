package hashmapAndHeap;

import java.util.*;

public class HighestFrequencyCharacter {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner scn = new Scanner(System.in);

		String str = scn.next();

		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hm.containsKey(c)) {
				int val = hm.get(c);
				val++;
				hm.put(c, val);
			} else {
				hm.put(c, 1);
			}
		}

		int max_count = 0;
		char ans = ' ';

		for (Character key : hm.keySet()) {
			int val = hm.get(key);
			if (val > max_count) {
				ans = key;
				max_count = val;
			}
		}

		System.out.println(ans);
	}

}