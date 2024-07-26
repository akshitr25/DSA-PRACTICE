package com.dsa.dp;

import java.util.Scanner;

public class DP33 { 
	public static void main(String as[])
	{
//		S-23 10 JULY OA CHALLENGE
//		Given a string s, return the length of longest palindromic substring in it.
//A string is a palindrome when it reads the same backward as forward.
//A substring is a contiguous sequence of characters within the string.
//		BETTER TC N+N+N^2=>N^2, SC N^2
		String s="abbaxyz";
		int n=s.length(),max=0;
		int dp[][]=new int[n][n];
		for(int i=0;i<n;i++) //len 1
		{
			dp[i][i]=1;
			max=1;
		}
		for(int i=0;i<n-1;i++) //len 2
		{
			char c1=s.charAt(i);
			char c2=s.charAt(i+1);
			if(c1==c2)
			{
				dp[i][i+1]=1;
				max=2;
			}
		}
		//......
		int len=3,i=0;
		while(len<=n)
		{
			i=0;
			while(i<n-len+1)
			{
				char c1=s.charAt(i);
				int j=i+len-1;
				char c2=s.charAt(j);
				if(c1==c2 && dp[i+1][j-1]==1)
				{
					dp[i][j]=1;
					max=len; //j-i+1
				}
				i++;
			}
			len++;
		}
		System.out.println(max);
	}
}