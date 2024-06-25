package com.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GRAPH6{
	public static void main(String as[])
	{//BFS ALGO
//		FIND NO OF SHORTEST PATHS NODE 1 to i. WAYS TO REACH FROM 1 to i.
		Scanner sc=new Scanner(System.in);
		System.out.println("NODES\tEDGES");
		int n=sc.nextInt(),e=sc.nextInt();
		ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
		for(int i=0;i<n+5;i++)
		{
			graph.add(new ArrayList<Integer>());
		}
		System.out.println("FROM\tTO");
		for(int i=1;i<=e;i++)
		{
			int from=sc.nextInt();
			int to=sc.nextInt();
			graph.get(from).add(to);
			graph.get(to).add(from);
		}
		int visited[]=new int[n+5];
		int ways[]=new int[n+5];
		ways[1]=1;
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
		int lvl[]=new int[n+5];
		while(!q.isEmpty())
		{
			int node=q.remove();
			for(int i=1;i<graph.get(node).size();i++)
			{
				int connected=graph.get(node).get(i); //node connected to our node
				if(visited[connected]==0) //not traversed. WE WILL ALWAYS GET LEAST/BEST LEVEL HERE
				{
					q.add(connected); //add to queue
					ways[connected]=ways[node];
					visited[connected]=1; //now traversed
					lvl[connected]=lvl[node]+1; //.
				}
				else // SOME OTHER PATH ALSO NEEDS T BE CONSIDERED FOR THE CONNECTED NODE.
				{
					if(lvl[node]+1==lvl[connected]) //.
					{
						ways[connected]+=ways[node];
					}
				}
			}
		}
		for(int i=1;i<=n;i++)
		{
			System.out.println("WAYS TO REACH FROM 1 TO "+i+" : "+ways[i]);
		}
	}
}

//NODES	EDGES
//5	6
//FROM	TO
//1	3
//1	4
//3	4
//3	5
//4	5
//3	1