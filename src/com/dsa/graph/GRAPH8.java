package com.dsa.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GRAPH8{ //A province is a group of directly or indirectly connected cities and no other cities outside of the group. (connected components)
	//TC same as DFS, O(N+E), SC : O(N)
	static int ans=0; //no of components
	static List<Integer>[] graph=new List[1000005];
	static int[] used=new int[1000005];
	static int comp=0; //no of nodes in a component
	static void DFS(int source) 
	{
		System.out.print(source+" ");
		comp++;
		used[source]=1;
		for(int u:graph[source])
		{
			if(used[u]==0)	DFS(u);
		}
	}
	public static void main(String as[])
	{//FIND NO OF PROVINCES THRU DFS
		Scanner sc=new Scanner(System.in);
		System.out.println("NODES\tEDGES");
		int n=sc.nextInt(),e=sc.nextInt();
//		List<Integer>[] graph=new List[n+5];
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
		int i=1;
		while(i<=n)
		{
			if(used[i]==0)
			{
				comp=0;
				System.out.print("\nNODES/CITIES IN COMPONENT/PROVINCE: ");
				DFS(i);
				System.out.println("\nNO OF NODES/CITIES IN COMPONENT/PROVINCE: "+comp);
				ans++; 
			}
			i++;
		}
		System.out.println("\nNO OF COMPONENT/PROVINCES: "+ans);
	}
}

//8 6 
//1 2 
//2 3 
//2 5 
//3 4  
//6 7 
//7 8 