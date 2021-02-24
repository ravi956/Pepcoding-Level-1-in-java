package hashmapAndHeap;

import java.util.*;
import java.io.*;

public class EfficientHeapConstructor {
	public static class PriorityQueue {
		ArrayList<Integer> data;

		public PriorityQueue() {
			data = new ArrayList<>();
		}
		
//		Efficient Constructor to make heap in O(n) time
		public PriorityQueue(int[] arr) {
			data = new ArrayList<>();
			for(int val : arr) {
				data.add(val);
			}
			
			for(int i=data.size()/2-1; i>=0; i--) {
				downheapify(i);
			}
		}

		public void add(int val) {
			// write your code here
			data.add(val);
			upheapify(data.size() - 1);
		}

		private void upheapify(int i) {
			if (i == 0) {
				return;
			}
			int pi = (i - 1) / 2;
			if (data.get(i) < data.get(pi)) {
				swap(i, pi);
				upheapify(pi);
			}
		}

		private void swap(int i, int j) {
			int ith = data.get(i);
			int jth = data.get(j);
			data.set(i, jth);
			data.set(j, ith);
		}

		public int remove() {
			// write your code here
			if (this.size() == 0) {
				System.out.println("Underflow");
				return -1;
			}
			swap(0, data.size() - 1);
			int val = data.remove(data.size() - 1);
			downheapify(0);
			return val;
		}

		private void downheapify(int pi) {
			int mini = pi;
			int li = 2 * pi + 1;
			if (li < data.size() && data.get(li) < data.get(mini)) {
				mini = li;
			}

			int ri = 2 * pi + 2;
			if (ri < data.size() && data.get(ri) < data.get(mini)) {
				mini = ri;
			}

			if (mini != pi) {
				swap(pi, mini);
				downheapify(mini);
			}
		}

		public int peek() {
			// write your code here
			if (this.size() == 0) {
				System.out.println("Underflow");
				return -1;
			}
			return data.get(0);
		}

		public int size() {
			// write your code here
			return data.size();
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = {20,30,10,4,6,99,45,11,44,59,71,60};
		PriorityQueue qu = new PriorityQueue(arr);
		
		String str = br.readLine();
		while (str.equals("quit") == false) {
			if (str.startsWith("add")) {
				int val = Integer.parseInt(str.split(" ")[1]);
				qu.add(val);
			} else if (str.startsWith("remove")) {
				int val = qu.remove();
				if (val != -1) {
					System.out.println(val);
				}
			} else if (str.startsWith("peek")) {
				int val = qu.peek();
				if (val != -1) {
					System.out.println(val);
				}
			} else if (str.startsWith("size")) {
				System.out.println(qu.size());
			}
			str = br.readLine();
		}
	}
}
