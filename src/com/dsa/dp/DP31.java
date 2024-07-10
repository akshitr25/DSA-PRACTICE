package com.dsa.dp;

import java.util.Scanner;

public class DP31 { 
	public static void main(String as[])
	{
//		S-23 10 JULY OA CHALLENGE
//		Given a string s, return the number of palindromic substrings in it.
//A string is a palindrome when it reads the same backward as forward.
//A substring is a contiguous sequence of characters within the string.
//		BF TC N^3, SC 1
		String s="abbaxyz";
		int n=s.length(),count=0,i=0,j=0,c=0,k,p;
		while(i<n)
		{
			j=i;
			while(j<n)
			{
				c=0;//merely a flag
				k=i;
				p=0;
				while(k<=j)
				{
					if(s.charAt(k)==s.charAt(k-p))
					{
						
					}
					else	c=1;
					p++;
					k++;
				}
				if(c==0)	count++;
				j++;
			}
			i++;
		}
		System.out.println(count);
	}
}