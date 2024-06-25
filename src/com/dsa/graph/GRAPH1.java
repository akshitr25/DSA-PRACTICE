package com.dsa.graph;

import java.util.Scanner;

public class GRAPH1 {
	public static void main(String as[])
	{//ADJACENCY MATRIX, if n less and e too many (dense graph)
		int graph[][]=new int[10000][10000];
		int n,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("EDGES\tNODES");
		n=sc.nextInt();
		e=sc.nextInt();
		System.out.println("FROM\tTO");
		for(int i=1;i<=e;i++)
		{
			int f=sc.nextInt();
			int t=sc.nextInt();
			graph[f][t]=1;
		}
		System.out.println("NODE\tOUTGOING");
		for(int i=0;i<n;i++)
		{
			int outgoing=0;
			for(int j=0;j<n;j++)
			{
				if(graph[i][j]==1)
					outgoing++;
			}
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