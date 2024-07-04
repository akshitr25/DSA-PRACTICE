package com.dsa.dp;

import java.util.Scanner;

public class DP23 {
	public static void main(String as[])
	{//S-17 4 JULY OA CHALLENGE
//		You are given two arrays a and b -> both are of size “N”. 
//		Start your journey at index 1 and end your journey at index “N”. 
//		In a move you can move from a[i]->a[i+1] or a[i]->b[i+1] !!!!!
//		OR 
//		b[i]->b[i+1] or b[i]->a[i+1] !!!!!
//		Output the number of journeys whose sum is even and odd.
//		TC N, SC N*2*2=>N 
		int a[]={1,2,1},b[]={3,1,1};
		int n=a.length;
		int dp[][][]=new int[n+1][2][2]; //index, a/b, even/odd
//		0 A, 1 B AND
//		0 EVEN, 1 ODD	
		if(a[0]%2==0)
			dp[0][0][0]=1;// A, EVEN
		else
			dp[0][0][1]=1; //A, ODD
		if(b[0]%2==0)
			dp[0][1][0]=1;// B, EVEN
		else
			dp[0][1][1]=1;// B, ODD
//		EVEN=ODD+ODD
//		EVEN=EVEN+EVEN
//		ODD=EVEN+ODD
//		ODD=EVEN+EVEN
		for(int i=1;i<n;i++)
		{
			if(a[i]%2==0)
			{
				dp[i][0][0]=dp[i-1][0][0]+dp[i-1][1][0]; // even sum journey
				dp[i][0][1]=dp[i-1][0][1]+dp[i-1][1][1]; // odd sum journey
			}
			else
			{
				dp[i][0][0]=dp[i-1][0][1]+dp[i-1][1][1]; // even sum journey
				dp[i][0][1]=dp[i-1][0][0]+dp[i-1][1][0]; //odd sum journey
			}
			if(b[i]%2==0)
			{
				dp[i][1][0]=dp[i-1][0][0]+dp[i-1][1][0]; //even sum journey
				dp[i][1][1]=dp[i-1][0][1]+dp[i-1][1][1]; //odd sum journey
			}
			else
			{
				dp[i][1][0]=dp[i-1][0][1]+dp[i-1][1][1]; // even sum journey
				dp[i][1][1]=dp[i-1][0][0]+dp[i-1][1][0]; // odd sum journey
			}
		}
		System.out.println("ODD SUM JOURNEYS: "+(dp[n-1][0][1]+dp[n-1][1][1]));
		System.out.println("EVEN SUM JOURNEYS: "+(dp[n-1][0][0]+dp[n-1][1][0]));
//		WRONG ANS BELOW:
//		System.out.println("ODD SUM JOURNEYS: "+Math.max(dp[n-1][0][1],dp[n-1][1][1]));
//		System.out.println("EVEN SUM JOURNEYS: "+Math.max(dp[n-1][0][0],dp[n-1][1][0]));
	}
}
