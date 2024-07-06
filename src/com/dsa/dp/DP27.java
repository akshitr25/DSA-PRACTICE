package com.dsa.dp;

import java.util.Scanner;

public class DP27 { 
	public static void main(String as[])
	{//S-20 6 JULY OA CHALLENGE
//		ALTERNATING FUNCTION
//		GIVEN AN ARRAY (size N), AND A FUNCTION:
//		F(l,r)=a[l]-a[l+1]+a[l+2]-....+((-1)^(r-l))*a[r], 1<=l<=r<=N
//		DIVIDE THE ARRAY INTO K contiguous subarrays such that:
//		 IF K=1, then find F(1,N)
//		 ELSE, F(1,i1)+F(i1+1,i2)+...+F(iK-1 +1,N) is MAX, where 1<=i1<=i2...<=iK-1<N
//		FIND MAX SUM.
//		1 BASED INDEXING
//		TC N, SC N*3=>N
		int a[]={0, -3,-1,-3},n=a.length,sum=0; // i=1,2,3, n=4
//test cases: 1,-2,3 | 1,-2,3,-4 | -3,-1,-3 | -4,-1,0 | 50,-8,-2,-3,-1 | 5,10,-2,-8,-1
//		if all elements in array are +ve/non-0, then every element is a separate subarray and the sum of them all is the ans.
//		if current element is -ve, then previous element has to be positive to make current element positive by -(-)=+
		int dp[][]=new int[n][3];
//		1:+, 2:-
//		dp[i][1]=best sum we can get till index i when + sign taken on b[i] 
//		dp[i][2]=best sum we can get till index i when - sign taken on b[i] 
		dp[1][1]=a[1];//1st element's sign cannot be toggled. it has to be picked as it is
		dp[1][2]=a[1];
//		cases for 1st 2 elements:
		//1st+, 2nd+
		//1st+, 2nd-
		//1st-, 2nd+
		//1st-, 2nd-
//		dp[2][1]=dp[1][1]+a[2];
//		dp[2][2]=dp[1][1]-a[2];
		for(int i=2;i<n;i++)
		{
				dp[i][1]=Math.max(dp[i-1][1],dp[i-1][2])+a[i];
				dp[i][2]=dp[i-1][1]-a[i];
			//if a[i] is negative, then we have to take previous element as positive only to make a[i] +ve
		}
		System.out.println(Math.max(dp[n-1][1],dp[n-1][2]));
	}
}