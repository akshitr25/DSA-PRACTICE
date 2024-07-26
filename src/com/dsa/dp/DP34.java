package com.dsa.dp;

import java.util.Scanner;

public class DP34 { 
	public static void main(String as[])
	{
//		S-25 10 JULY OA CHALLENGE
//		Find whether a palindromic subsequence of length >=k exists in a string.
//		TC , SC
//		here dp[i][j]=no of subsequences such that they are in i..j and a palindrome.
		String s="bbbbbbbbb"; //abbaxyz
		int n=s.length();
		int dp[][]=new int[n][n];
		for(int i=0;i<n;i++) //len 1
		{
			dp[i][i]=1;
		}
		for(int i=0;i<n-1;i++) //len 2
		{
			char c1=s.charAt(i);
			char c2=s.charAt(i+1);
			if(c1==c2)
			{
				dp[i][i+1]=3;
			}
			else
			{
				dp[i][i+1]=2;
			}
		}
		//......
		int len=3,i=0;
		while(len<=n)
		{
			i=0;
			while(i<n-len+1)
			{
				char ci=s.charAt(i);
				int j=i+len-1;
				char cj=s.charAt(j);
				if(ci!=cj)
				{
					dp[i][j]=dp[i][j-1]+dp[i+1][j]-dp[i+1][j-1];
				}
				else
				{
					dp[i][j]=1+dp[i][j-1]+dp[i+1][j];
				}
				i++;
			}
			len++;
		}
		System.out.println(dp[0][n-1]);
	}
}