package com.dsa.dp;

public class DP19 {
	public static void main(String as[])
	{//IGNORE THIS SOL. IT DIDN'T WORK.
		//Taro's summer vacation starts tomorrow, and he has decided to make plans for it now.
//		The vacation consists of N days. For each i (1≤i≤N), Taro will choose one of the following activities and do it on the i-th day:
//		
//		A: Swim in the sea. Gain ai points of happiness.
//		B: Catch bugs in the mountains. Gain bi points of happiness.
//		C: Do homework at home. Gain ci points of happiness.
//		As Taro gets bored easily, he cannot do the same activities for two or more consecutive days.
//		HERE, CAN DO 1 ACTIVITY FOR MAX 2 CONSECUTIVE DAYS! TWIST.
//		Find the maximum possible total points of happiness that Taro gains.
		//i/p-> a1, b1, c1
		//      a2, b2, c2
		//................
		//if we dont know at each step that this option will give best answer now and also in future, then GREEDY/TWO POINTER
		//ELSE, DP. best decision for future.
//		int a[]= {10,40,70},n=a.length; //actual way of taking i/p.
//		int b[]= {20,50,80};
//		int c[]= {30,60,90};
		//3 dp arrays, dpa,dpb,dpc
		int a[]= {10,20,30},n=a.length;
		int b[]= {40,50,60};
		int c[]= {70,80,90};
		int dpa[][]=new int[n][3];
		int dpb[][]=new int[n][3];
		int dpc[][]=new int[n][3];
//		int dp[]=new int[n];
		dpa[0][1]=a[0]; //best ans if A picked at index i=0.
		dpa[0][2]=0; 
		dpb[0][1]=b[0];
		dpb[0][2]=0;
		dpc[0][1]=c[0];
		dpc[0][2]=0;
		//dpa[1][1]=Math.max(dpb[0][1]+b[1],dpc[0][1]+c[1]);
		//dpa[1][2]=Math.max(dpa[0][1]+a[1],dpb[0][1]+b[1],dpc[0][1]+c[1]);

		//dpa[i]=a[i]+Math.max(dpb[i-1],dpc[i-1]);
		//dpb[i]=b[i]+Math.max(dpa[i-1],dpc[i-1]);
		//dpc[i]=c[i]+Math.max(dpa[i-1],dpb[i-1]);
		for(int i=1;i<n;i++)
		{
			dpa[i][1]=Math.max(dpb[i-1][1]+a[i-1],dpc[i-1][1]+a[i-1]);
			dpa[i][2]=dpa[i-1][1]+a[i-1];
			dpb[i][1]=Math.max(dpa[i-1][1]+b[i-1],dpc[i-1][1]+b[i-1]);
			dpb[i][2]=dpb[i-1][1]+b[i-1];
			dpc[i][1]=Math.max(dpa[i-1][1]+c[i-1],dpb[i-1][1]+c[i-1]);
			dpc[i][2]=dpc[i-1][1]+c[i-1];
		}
		System.out.println(Math.max(maxOf3(dpa[n-1][1],dpb[n-1][1],dpc[n-1][1]),maxOf3(dpa[n-1][2],dpb[n-1][2],dpc[n-1][2])));
	}
	public static int maxOf3(int a,int b,int c)
	{
		return Math.max(Math.max(a,b),c);
	}
}
