package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH30 {
	static int matching(String a,String b)
	{
		int count=0;
		for(int i=0;i<Math.min(a.length(),b.length());i++)
		{
			if(a.charAt(i)==b.charAt(i))	count++;
		}
		return count;
	}
	public static void main(String as[])
	{// hash 26!
//		For each string at index “i” you have to print the sum of matching characters of string “i” with string - “i+1” “i+2” “i+3” “i+4” “i+5” …… and so on. 
//		BF TC N^2, SC N
		String[] s= {"bbz","zaz","aaa","zaa","zzz"};
		int n=s.length,count=0,ans=0;
		int finalans[]=new int[n];
		for(int i=n-1;i>=0;i--)
		{
			ans=0;
			if(i==n-1)	ans=0;
			else
			{
				for(int j=i+1;j<n;j++)
				{
					count=matching(s[i],s[j]);
					ans+=count;
				}
			}
			finalans[i]=ans;
		}
		for(int i:finalans)
			System.out.print(i+" ");
	}
}
