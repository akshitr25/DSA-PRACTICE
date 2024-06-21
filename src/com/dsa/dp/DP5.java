package com.dsa.dp;

public class DP5 {
	public static void main(String as[])
	{
		//PERSON AT CITY 1, TO REACH CITY N, REPEAT:
		// CAN JUMP TO i+1 OR i+3 and COST=abs(city[i]-city[j])
		//FIND MIN FLIGHT COST TO REACH city N.
		//TC: O(N),SC: O(N) 
		int city[]= {4,12,13,18,10,12},n=city.length;
		int dp[]=new int[n];
		dp[0]=0;
		dp[1]=Math.abs(city[1]-city[0]); //8
		dp[2]=Math.abs(city[1]-city[2])+dp[1]; //
		//dp[3]=min(abs(city[3]-city[2])+dp[2],abs(city[3]-city[0])+dp[0])
		//dp[i]=min(abs(city[i]-city[i-1])+dp[i-1],abs(city[i]-city[i-3])+dp[i-3])
		for(int i=3;i<n;i++)
		{
			dp[i]=Math.min(Math.abs(city[i]-city[i-1])+dp[i-1],Math.abs(city[i]-city[i-3])+dp[i-3]);
		}
		System.out.println(dp[n-1]);
	}
}
