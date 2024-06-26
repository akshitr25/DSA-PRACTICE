package com.dsa.graph;

import java.util.*;
 
public class GRAPH9{
    static int[] used = new int[100005];
    static List<Integer>[] G = new ArrayList[100005];
 
    static void bfs(int source) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        used[source] = 1;
        System.out.println();
 
        int c = 0;
        while (!q.isEmpty()) {
            int removed = q.poll();
            System.out.print(removed + " ");
            c++;
 
            for (int u : G[removed]) {
                if (used[u] == 0) {
                    q.add(u);
                    used[u] = 1;
                }
            }
        }
 
        System.out.println("Size of this component: " + c + '\n');
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int n = scanner.nextInt();
        int m = scanner.nextInt();
 
        for (int i = 1; i <= n; i++) {
            G[i] = new ArrayList<>();
        }
 
        int i = 1;
        while (i <= m) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            G[x].add(y);
            G[y].add(x);
            i++;
        }
 
        i = 1;
        while (i <= n) {
            if (used[i] == 0) {
                bfs(i);
            }
            i++;
        }
    }
}