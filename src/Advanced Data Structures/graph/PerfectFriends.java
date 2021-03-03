package graph;

import java.io.*;
import java.util.*;

public class PerfectFriends {
	public static class Edge {
		int v;
		int n;

		Edge(int v, int n) {
			this.v = v;
			this.n = n;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());

		// write your code here
		ArrayList<Edge>[] graph = new ArrayList[n];
		for (int v = 0; v < n; v++) {
			graph[v] = new ArrayList<>();
		}

		for (int e = 0; e < k; e++) {
			String line = br.readLine();
			String[] parts = line.split(" ");

			int v1 = Integer.parseInt(parts[0]);
			int v2 = Integer.parseInt(parts[1]);

			graph[v1].add(new Edge(v1, v2));
			graph[v2].add(new Edge(v2, v1));
		}

		ArrayList<Integer> clubs = new ArrayList<>();
		boolean[] visited = new boolean[n];

		for (int v = 0; v < n; v++) {
			if (visited[v] == false) {
				count = 0;
				clubMemberCount(graph, v, visited);
				clubs.add(count);
			}
		}

		int result = 0;

		for (int i = 0; i < clubs.size() - 1; i++) {
			for (int j = i + 1; j < clubs.size(); j++) {
				result += clubs.get(i) * clubs.get(j);
			}
		}

		System.out.println(result);
	}

	static int count;

	public static void clubMemberCount(ArrayList<Edge>[] graph, int src, boolean[] visited) {
		visited[src] = true;
		count++;
		for (Edge e : graph[src]) {
			if (visited[e.n] == false) {
				clubMemberCount(graph, e.n, visited);
			}
		}
	}

}