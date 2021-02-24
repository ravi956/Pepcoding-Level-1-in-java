package hashmapAndHeap;

import java.util.*;

public class ComparableVsComparator {
	
	static class Student implements Comparable<Student>{
		int rno;
		int ht;
		int wt;
		
		Student(int rno, int ht, int wt){
			this.rno = rno;
			this.ht = ht;
			this.wt = wt;
		}
		
		public int compareTo(Student o) {
			return this.rno - o.rno;
		}
		
		public String toString() {
			return "Rno = " + this.rno + ", Ht = " + this.ht + ", Wt = " + this.wt;
		}

	}
	
	static class StudentHtComparator implements Comparator<Student> {
		public int compare(Student s1, Student s2) {
			return s1.ht - s2.ht;
		}
	}
	
	static class StudentWtComparator implements Comparator<Student> {
		public int compare(Student s1, Student s2) {
			return s1.wt - s2.wt;
		}
	}

	public static void main(String[] args) throws Exception {
		PriorityQueue<Student> pq = new PriorityQueue<>(); // For using comparable
//		PriorityQueue<Student> pq = new PriorityQueue<>(new StudentHtComparator()); // For using Comparator
		
		pq.add(new Student(10,180,45));
		pq.add(new Student(1,185,42));
		pq.add(new Student(13,189,39));
		pq.add(new Student(34,170,38));
		pq.add(new Student(22,165,35));
		
		while(pq.size()>0) {
			System.out.println(pq.peek());
			pq.remove();
		}
	}
}