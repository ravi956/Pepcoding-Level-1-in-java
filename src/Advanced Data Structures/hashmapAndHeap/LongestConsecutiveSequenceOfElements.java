package hashmapAndHeap;

import java.util.*;

public class LongestConsecutiveSequenceOfElements {

	public static void main(String[] args) throws Exception {
		// write your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		HashMap<Integer, Boolean> hm = new HashMap<>();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
			hm.put(arr[i], true);
		}

		for (int i = 0; i < n; i++) {
			if (hm.containsKey(arr[i] - 1)) {
				hm.put(arr[i], false);
			}
		}

		int start = 0;
		int max_count = 0;
		for (int i = 0; i < n; i++) {
			if (hm.get(arr[i])) {
				int count = 1;
				while (hm.containsKey(arr[i] + count)) {
					count++;
				}
				if (count > max_count) {
					start = arr[i];
					max_count = count;
				}
			}
		}

		for (int i = 0; i < max_count; i++) {
			System.out.println(start + i);
		}
	}

}