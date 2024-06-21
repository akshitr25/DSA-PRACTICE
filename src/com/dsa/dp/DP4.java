package com.dsa.dp;

public class DP4 {
	public static void main(String as[])
	{
//		Select maximum sum subset from the two arrays such that no two elements are consecutive.
//		At each step, we are allowed to :
//		Decrement the given number by ‘1’……..(i)
//		Decrement the given number by ‘2’ ………..(ii)
//		Divide the given number by ‘7’ only if it is divisible by ‘7’……..(iii)

		int x=76; //74,72,70,10,8,7,1
		int dp[]=new int[x+1];
		//dp[i] is the best answer for any number ‘i’. In other words, dp[i]=minimum number of steps required to convert the number ‘i’ to 1.
		//dp[1]=0; //1 is already 1
		//dp[2]=1; //2-1
		//dp[3]=min(dp[3-1]+1,dp[3-2]+1)
		//dp[7]=1;
		//dp[i]=min(min(dp[i-1]+1,dp[i-2]+1),dp[i/7]+1:(only ifi%7==0));
		dp[1]=0;
		dp[2]=1;
		for(int i=3;i<=x;i++)
		{
			if(i%7==0)
				dp[i]=Math.min(Math.min(dp[i-1]+1,dp[i-2]+1),dp[i/7]+1);
			else
				dp[i]=Math.min(dp[i-1]+1,dp[i-2]+1);
		}
		System.out.println(dp[x]);
	}
}
