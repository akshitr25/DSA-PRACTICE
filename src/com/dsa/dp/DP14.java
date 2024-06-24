package com.dsa.dp;

public class DP14 {
	public static void main(String as[])
	{//CORRECT SOLN
//		Given an integer “N” ; find the minimum cost to reduce it to 1
//		The operations you can do are as follows.->
//
//		i) Reduce the number by 1 in “y” dollars; 
//
//		ii) Reduce the number by /7 in “x” dollars.(if number is divisible by 7)
//
//		iii) Reduce the number by /3 in “z” dollars;(if number is divisible by 3)
//
//		iv) Reduce the number by /5 in “b” dollars;(if number is divisible by 5) 
		int n=15; //y+x+y
		int y=100; //for i-1
		int x=1; //for i/7 (iff i%7==0)
		int z=500; //for i/3 (iff i%3==0)
		int b=10000000; //for i/5 (iff i%5==0)
		int dp[]=new int[n+1];
		dp[1]=0;
		for(int i=2;i<=n;i++)
		{
			int v1=dp[i-1]+y; //i-1
			int v3=Integer.MAX_VALUE; //i/3
			int v5=Integer.MAX_VALUE; //i-5
			int v7=Integer.MAX_VALUE; //i-7
			if(i%7==0)	v7=dp[i/7]+x;
			else if(i%5==0)	v5=dp[i/5]+b;
			else if(i%3==0)	v3=dp[i/3]+z;
			else	v1=dp[i-1]+y;
			dp[i]=minOf4(v1,v3,v5,v7);
		}
		System.out.println(dp[n]);
	}
	public static int minOf4(int a,int b,int c,int d)
	{
		return Math.min(Math.min(a,b),Math.min(c,d));
	}
}
