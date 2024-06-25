package com.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GRAPH5{
	public static void main(String as[])
	{//BFS ALGO
		//CHECK THE NODE THAT IS IN QUEUE. AND THEN REMOVE THE NODE AND ADD ALL NODES THAT ARE DIRECTLY CONNECTED TO THAT NODE AND HAVE NEVER BEEN VISITED BEFORE.
		//FIND WHETHER NODE i is REACHABLE FROM SOURCE (1)OR NOT
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
		System.out.println("SOURCE NODE: ");
		int source=sc.nextInt();//start node
		int used[]=new int[n+5];
		used[1]=1;
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
		int lvl[]=new int[n+5];
		for(int i=0;i<n+5;i++)	lvl[i]=-1;
//		System.out.println("\nNODE\tLEVEL");
		while(!q.isEmpty())
		{
			int node=q.remove();
			//System.out.println(node+"\t"+lvl[node]);
			for(int i=0;i<graph.get(node).size();i++)
			{
				int connected=graph.get(node).get(i); //node connected to our node
				if(used[connected]==0) //not traversed
				{
					q.add(connected); //add to queue
					used[connected]=1; //now traversed
					lvl[connected]=lvl[node]+1; //connected node will be 1 level greater than level of our node
				}
				//else (node already visited, so do nothing)
			}
		}
        int sourcelvl=lvl[source];
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+" REACHABLE FROM "+source+": "+(used[i]>0));
		}
	}
}

//from to
//5 	4
//0 	1
//1 	2
//2 	3
//2 	4