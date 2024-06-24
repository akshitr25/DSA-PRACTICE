package com.dsa.dp;

public class DP16 {
	public static void main(String as[])
	{
//		Reduce n to 1 
//		If the number is even you can divide it by 2. 
//		If the number is odd you can do +1 or -1 
		int n=100; //11,10,5,4,2,1 | 10,5,4,2,1
		int dp[]=new int[n+1]; //dp[i]: best ans for index i or min steps to reduce i to 1.
		dp[1]=0;
		//dp[1]=1
		//dp[2]1
		//dp[3]=min(dp[2]+1,dp[4/2]+2)
//		/dp[4/2]+2 2 steps as extra step is of (i+1)/(2) division by 2 is a step.
		//dp[i+1]=dp[(i+1)/2]+2
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
				dp[i]=dp[i/2]+1;
			else if(i%2!=0)
			{
				dp[i]=Math.min(dp[i-1]+1,dp[(i+1)/2]+2);
			}
		}
		System.out.println(dp[n]);
	}
}
