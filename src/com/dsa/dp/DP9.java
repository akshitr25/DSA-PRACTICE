package com.dsa.dp;

public class DP9 {
	public static void main(String as[])
	{
		//Taro's summer vacation starts tomorrow, and he has decided to make plans for it now.
//		The vacation consists of N days. For each i (1≤i≤N), Taro will choose one of the following activities and do it on the i-th day:
//		
//		A: Swim in the sea. Gain ai points of happiness.
//		B: Catch bugs in the mountains. Gain bi points of happiness.
//		C: Do homework at home. Gain ci points of happiness.
//		As Taro gets bored easily, he cannot do the same activities for two or more consecutive days.
//		
//		Find the maximum possible total points of happiness that Taro gains.
		//i/p-> a1, b1, c1
		//      a2, b2, c2
		//................
		//if we dont know at each step that this option will give best answer now and also in future, then GREEDY/TWO POINTER
		//ELSE, DP. best decision for future.
		//P0, just find maxsum with 1 element from 1 array at any index.
//		int a[]= {10,40,70},n=a.length;
//		int b[]= {20,50,80};
//		int c[]= {30,60,90};
		int a[]= {10,20,30},n=a.length;
		int b[]= {40,50,60};
		int c[]= {70,80,90};
		int dp[]=new int[n];
		dp[0]=maxOf3(a[0],b[0],c[0]); //30,c
		for(int i=1;i<n;i++)
			dp[i]=maxOf3(a[i],b[i],c[i])+dp[i-1];
		System.out.println(dp[n-1]);
	}
	public static int maxOf3(int a,int b,int c)
	{
		return Math.max(Math.max(a,b),c);
	}
}
