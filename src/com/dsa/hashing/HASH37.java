package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH37 {
	static int a[]= {3,14,15};
	public static void main(String as[])
	{// hash 29!
//		Given an array, for all pairs (i<j), calc F(i,j) and find sum of all F(i,j)
//		BF TC N^2*2L=>N^2, SC 1
		int n=a.length,sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				sum+=F(i,j);
			}
		}
		System.out.println(sum);
	}
	static int F(int i,int j)
	{
		String si=Integer.toString(a[i]);
		String sj=Integer.toString(a[j]);
		int f=Integer.parseInt(si+sj);
		return f;
	}
}
