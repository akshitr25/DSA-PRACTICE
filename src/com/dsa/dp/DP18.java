package com.dsa.dp;

import java.util.Scanner;

public class DP18 {
	public static void main(String as[])
	{//-ve x -ve = +ve
		//b queries
		//start at 1, find max final val.
		//options: +x,-x,/x,*x
		//select in order, although we can skip some queries/steps
		//maintain dpmax[i] and dpmin[i] i.e max and min energy at ith index.
		/*

		2
		3
		N
		- 2
		N
		3
		- 1
		* 4
		/ 2 
		  
		  */
		Scanner sc=new Scanner(System.in);
		System.out.print("t = ");
		int t=sc.nextInt();
		sc.nextLine();
		for(int j=1;j<=t;j++)
		{
			System.out.print("n"+j+" = ");
			int n=sc.nextInt();
			sc.nextLine();
			int dpmax[]=new int[n+1];
			int dpmin[]=new int[n+1];
			dpmax[0]=1;
			dpmin[0]=1;
			for(int i=1;i<=n;i++)
			{
				System.out.print("BALLOON "+i+" = ");
				String line=sc.nextLine();
				//System.out.println(line);
				char op=line.charAt(0);
				int val=0;
				if(line.length()>2)
					val=Integer.parseInt(line.substring(2));
				//System.out.println(op);
				if(op=='+')
				{
					dpmax[i]=max(dpmax[i-1]+val,dpmax[i-1],dpmin[i-1]+val);
					dpmin[i]=min(dpmax[i-1]+val,dpmin[i-1],dpmin[i-1]+val);
				}
				else if(op=='*')
				{
					dpmax[i]=max(dpmax[i-1]*val,dpmax[i-1],dpmin[i-1]*val);
					dpmin[i]=min(dpmax[i-1]*val,dpmin[i-1],dpmin[i-1]*val);
				}
				else if(op=='/')
				{
					dpmax[i]=max(dpmax[i-1]/val,dpmax[i-1],dpmin[i-1]/val);
					dpmin[i]=min(dpmax[i-1]/val,dpmin[i-1],dpmin[i-1]/val);
				}
				else if(op=='-')
				{
					dpmax[i]=max(dpmax[i-1]-val,dpmax[i-1],dpmin[i-1]-val);
					dpmin[i]=min(dpmax[i-1]-val,dpmin[i-1],dpmin[i-1]-val);
				}
				else// if(op=='N')
				{
					dpmax[i]=max(-1*dpmax[i-1],dpmax[i-1],-1*dpmin[i-1]);
					dpmin[i]=min(-1*dpmax[i-1],dpmin[i-1],-1*dpmin[i-1]);
				}
			}
			System.out.println("MAX ENERGY POSSIBLE = "+dpmax[n]);
		}
	}
	public static int min(int a,int b,int c)
	{
		return Math.min(Math.min(a,b),c);
	}
	public static int max(int a,int b,int c)
	{
		return Math.max(Math.max(a,b),c);
	}
}
