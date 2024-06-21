package com.dsa.dp;

public class DP6 {
	public static void main(String as[])
	{
		//FROG AT STONE 1, TO REACH STONE N, REPEAT:
		// CAN JUMP TO i+1 or i+2, BUT COST=abs(h[i]-h[j])
		//FIND MIN COST TO REACH STONE N.
		//int s[]= {10,10},n=s.length;
		int s[]= {30,10,60,10,60,50},n=s.length;
		//int s[]= {10,30,40,20},n=s.length; //1 based indexing so array of n+1 length
		int dp[]=new int[n];
		dp[0]=0;
		dp[1]=Math.abs(s[1]-s[0]);//+dp[0] but its already 0.
		if(n==2)
		{
			System.out.println(dp[n-1]);
		}
		else
		{
			dp[2]=Math.min(Math.abs(s[2]-s[1])+dp[1],Math.abs(s[2]-s[0]));
			for(int i=3;i<n;i++)
			{ // either i+1 or i+2
				dp[i]=Math.min(Math.abs(s[i]-s[i-1])+dp[i-1],Math.abs(s[i]-s[i-2])+dp[i-2]);
			}
			System.out.println(dp[n-1]);
		}
	}
}
