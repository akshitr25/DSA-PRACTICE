package com.dsa.dp;

public class DP7 {
	public static void main(String as[])
	{
		//FROG AT STONE 1, TO REACH STONE N, REPEAT:
		// CAN JUMP TO i+1......i+k, BUT COST=abs(s[i]-s[j])
		//FIND MIN COST TO REACH STONE N.
		int s[]= {10,30,40,50,20},k=3,n=s.length; //0 based indexing
		int dp[]=new int[n]; //dp[n-1] will be answer.
		//dp[0]=0
		//dp[1]=abs(s[1]-s[0]) +(dp[0]), but dp[0]=0
		//dp[i]=Math.abs(s[i-1]-s[i])+dp[i-1];  k=1
		//dp[i]=Math.abs(s[i-2]-s[i])+dp[i-2]); k=2
		//dp[i]=Math.abs(s[i-k]-s[i])+dp[i-k]; k
		if(n==2)
			System.out.println(dp[1]);
		else
		{
			dp[0]=0;
			dp[1]=Math.abs(s[1]-s[0]);
			int i=2;
			while(i<n)
			{
				int mincost=Integer.MAX_VALUE;
				int j=1;
					while(j<=k && i-j>=1)//for(int j=0;j<k;j++) could have worked but i-j<=0 case wont be covered.
					{	//go from i-j to i, and calc cost
						int cost=Math.abs(s[i-j]-s[i])+dp[i-j];
						mincost=Math.min(mincost,cost);
						j++;
					}	
					dp[i]=mincost;
				i++;
			}
		}
		System.out.println(dp[n-1]);
	}
}
