package com.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GRAPH3 {
	public static void main(String as[])
	{//BFS ALGO. LEVEL WISE TRAVERSAL. CAN ALWAYS FIND SHORTEST DIST FROM GIVEN NODE TO  ALL OTHER NODES.
		//USING QUEUE
		//CHECK THE NODE THAT IS IN QUEUE. AND THEN REMOVE THE NODE AND ADD ALL NODES THAT ARE DIRECTLY CONNECTED TO THAT NODE AND HAVE NEVER BEEN VISITED BEFORE.
		Scanner sc=new Scanner(System.in);
		System.out.println("EDGES\tNODES");
		int n=sc.nextInt(),e=sc.nextInt();
		ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
		for(int i=0;i<=n;i++)
		{
			graph.add(new ArrayList<Integer>());
		}
		for(int i=1;i<=e;i++)
		{
			int from=sc.nextInt();
			int to=sc.nextInt();
			graph.get(from).add(to);
			graph.get(to).add(from);
		}
		//int source=1;//start node
		int used[]=new int[n+5];
		used[1]=1;
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
		int lvl[]=new int[n+5];
		lvl[1]=0;
		System.out.println("\nNODE\tLEVEL");
		while(!q.isEmpty())
		{
			int node=q.remove();
			System.out.println(node+"\t"+lvl[node]);
			for(int i=0;i<graph.get(node).size();i++)
			{
				int connected=graph.get(node).get(i); //node connected to our node
				if(used[connected]==0) //not traversed
				{
					q.add(connected); //add to queue
					used[connected]=1; //now traversed
					lvl[connected]=lvl[node]+1; //connected node will be 1 level greater than level of our node
				}
			}
		}
//		System.out.println("NODE\tOUTGOING");
//		for(int i=0;i<n;i++)
//		{
//			int outgoing=graph[i].size();
//			System.out.println(i+"\t"+outgoing);
//		}
	}
}

//from to
//5 	4
//0 	1
//1 	2
//2 	3
//2 	4