package com.dsa.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GRAPH2 {
	public static void main(String as[])
	{//adjacency list, when n and e are around same values
		Scanner sc=new Scanner(System.in);
		System.out.println("EDGES\tNODES");
		int n=sc.nextInt(),e=sc.nextInt();
		ArrayList<Integer>[] graph=new ArrayList[n];
		System.out.println("FROM\tTO");
		for(int i=0;i<n;i++)
		{
			graph[i]=new ArrayList<>();
		}
		for(int i=1;i<=e;i++)
		{
			int from=sc.nextInt();
			int to=sc.nextInt();
			graph[from].add(to);
			graph[to].add(from);
		}
		System.out.println("NODE\tOUTGOING");
		for(int i=0;i<n;i++)
		{
			int outgoing=graph[i].size();
			System.out.println(i+"\t"+outgoing);
		}
	}
}

//from to
//5 	4
//0 	1
//1 	2
//2 	3
//2 	4