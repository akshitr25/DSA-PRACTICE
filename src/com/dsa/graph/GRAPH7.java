package com.dsa.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GRAPH7{
	public static void DFS(int node,List<Integer>[] graph,List<Integer> used,List<Integer> parent)
	{
		System.out.print(node+" ");
		used.set(node,1);
		for(int u:graph[node])
		{
			if(used.get(u)==0) //not explored
			{
				parent.set(u,node);
				DFS(u,graph,used,parent); //exploring it entirely dfs
			}
		}
	}
	public static void main(String as[])
	{//DFS: Explore all child nodes of the source and then move upwards back to the source.
		Scanner sc=new Scanner(System.in);
		System.out.println("NODES\tEDGES");
		int n=sc.nextInt(),e=sc.nextInt();
		List<Integer>[] graph=new List[n+5];
		for(int i=0;i<n+5;i++)
		{
			graph[i]=new ArrayList<Integer>();
		}
		System.out.println("DFS");
		for(int i=1;i<=e;i++)
		{
			int from=sc.nextInt();
			int to=sc.nextInt();
			graph[from].add(to);
			graph[to].add(from);
		}
		List<Integer> used=new ArrayList<>(n+5);
		List<Integer> parent=new ArrayList<>(n+5);
		for(int j=0;j<n+5;j++)
		{
			used.add(0);
			parent.add(0);
		}
		DFS(1,graph,used,parent);
	}
}