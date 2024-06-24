package com.dsa.dp;

public class DP17 {
	public static void main(String as[])
	{//MY CODE IS NOT WORKING
//		given an array of costs. start at index 1.
//		1. EITHER 2 JUMPS FORWARD or 1 JU,P BACKWARD.
//		2. if u land on an index, have t add that cost to the total.
//		find minimum cost needed to cross the array or reach the end of the array. CAN VISIT ANY INDEX ONLY 1 TIME.
//		CAN GO BEYOND N AND GET MIN COSTSUM.
		//2 5 8
		//2 -100 8 5 0 //IT IS NOT POSSIBLE TO JUMP BACKWARD 2 CONSECUTIVE TIMES AS IT WOULD MAKE THE REACHED ELEMENT VISITED 2X.
		int a[]={0,2,10,8,-5,-10,5},n=a.length-1;
		//dp[i][fwd]=dp[i][2]//best ans when someone is coming from index i-2 to i;
		//dp[i][bwd]=dp[i][1]//best ans when someone is coming from index i+1 to i
		//dp[n-1][bwd]=Integer.MAX_VALUE;
		//dp[i][bwd]=dp[i-1][fwd]+a[i]+a[i+1]
		//dp[i][fwd]=Math.min(dp[i-2][fwd]+a[i],dp[i-2][bwd]+a[i])
		int dp[][]=new int[n+1][5];
		//bwd=1,fwd=2
		dp[1][2]=a[1];
		dp[1][1]=Integer.MAX_VALUE; //CAN NEVER COME BACK TO INDEX 1, AS ITS ALREADY COVERED.
		dp[2][2]=Integer.MAX_VALUE;
		dp[2][1]=dp[1][2]+a[2]+a[3];//to come to 2 from right, go from 1 to 3, and then 3 to 2.
		int i;
		for(i=3;i<=n-1;i++)
		{
			dp[i][1]=dp[i-1][2]+a[i]+a[i+1];
			dp[i][2]=Math.min(dp[i-2][2],dp[i-2][1])+a[i];
		}
		i++; //makes i=n
		dp[i][1]=Integer.MAX_VALUE;
		dp[i][2]=Math.min(dp[i-2][2],dp[i-2][1])+a[n];//n=i
		System.out.println(Math.min(Math.min(dp[n][2],dp[n-1][1]),dp[n-1][2]));
	}
}
