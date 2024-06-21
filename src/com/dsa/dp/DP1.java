package com.dsa.dp;

public class DP1 {
	public static void main(String as[])
	{
		//Problem-1 : We are given an array of integers(a[n]) . 
		//We are given multiple queries of the form : (1, i) which means we need to output the sum of all numbers from index- ‘1’ to index ‘i’ of the array.
		int a[]={4,5,3,2,1},q=2,n=a.length;
		int dp[]=new int[n];
		//dp[i]=dp[i-1]+a[i];
		dp[0]=4;
		for(int i=1;i<n;i++) //O(N) instead of O(N*Q)
		{
			dp[i]=dp[i-1]+a[i];
		}
		System.out.println("INDEX: "+q+" ,VALUE:"+a[q]+" SUM: "+dp[q]);
	}
}
