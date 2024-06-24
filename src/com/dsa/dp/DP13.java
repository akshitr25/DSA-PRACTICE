package com.dsa.dp;

public class DP13 {
	public static void main(String as[])
	{//MY SOLN
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
		dp[2]=y;//100
		dp[3]=Math.min(z,dp[2]+y);//500,200->200
		dp[4]=dp[3]+y;//300
		dp[5]=Math.min(Math.min(b,dp[4]+y),dp[3]+2*z);//(10000000,400,1200)
		dp[6]=dp[5]+y;//500
		dp[7]=Math.min(Math.min(x,dp[6]+y),Math.min(dp[5]+2*b,dp[3]+4*z));//(1,600,400+2*10^7,2200)
		for(int i=8;i<=n;i++)
		{
			if(i%3==0)
			{
				dp[i]=Math.min(dp[i/3]+z,dp[i-1]+y);
			}
			else if(i%5==0) //5-5,5-2,5-1
			{
				dp[i]=Math.min(dp[i/5]+b,dp[i-1]+y);
			}
			else if(i%7==0) //7-6,7-2,7-4,7-1
			{
				dp[i]=Math.min(dp[i/7]+x,dp[i-1]+y);
			}
			else
			{
				dp[i]=dp[i-1]+y;
			}
		}
		System.out.println(dp[n]);
	}
}
