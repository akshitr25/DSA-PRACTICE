package com.dsa.dp;

public class DP10 {
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
//		int a[]= {10,40,70},n=a.length; //actual way of taking i/p.
//		int b[]= {20,50,80};
//		int c[]= {30,60,90};
		//3 dp arrays, dpa,dpb,dpc
		int a[]= {10,20,30},n=a.length;
		int b[]= {40,50,60};
		int c[]= {70,80,90};
		int dpa[]=new int[n];
		int dpb[]=new int[n];
		int dpc[]=new int[n];
//		int dp[]=new int[n];
		dpa[0]=a[0];
		dpb[0]=b[0];
		dpc[0]=c[0];
		//dpa[i]=a[i]+Math.max(dpb[i-1],dpc[i-1]);
		//dpb[i]=b[i]+Math.max(dpa[i-1],dpc[i-1]);
		//dpc[i]=c[i]+Math.max(dpa[i-1],dpb[i-1]);
		for(int i=1;i<n;i++)
		{
			dpa[i]=a[i]+Math.max(dpb[i-1],dpc[i-1]);
			dpb[i]=b[i]+Math.max(dpa[i-1],dpc[i-1]);
			dpc[i]=c[i]+Math.max(dpa[i-1],dpb[i-1]);
		}
		System.out.println(maxOf3(dpa[n-1],dpb[n-1],dpc[n-1]));
	}
	public static int maxOf3(int a,int b,int c)
	{
		return Math.max(Math.max(a,b),c);
	}
}
