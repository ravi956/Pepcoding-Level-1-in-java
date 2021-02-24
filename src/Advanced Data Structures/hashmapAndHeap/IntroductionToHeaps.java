package hashmapAndHeap;

import java.util.*;

public class IntroductionToHeaps {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(); //Min Heap
//		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //Max Heap
		
		int[] ranks = {22,99,3,11,88,4,1};
		
		for(int val : ranks) {
			pq.add(val);
		}
		
		while(pq.size()>0) {
			System.out.println(pq.peek());
			pq.remove();
		}
	}
}
