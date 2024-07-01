package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH38 {
	static int a[]= {3,14,15};
	public static void main(String as[])
	{// hash 29!
//		Given an array, for all pairs (i<j), calc F(i,j) and find sum of all F(i,j)
//		OPTIMAL TC N, SC 1
		int n=a.length,sum=0,ans=0;//sum of first i-1 numbers
		for(int j=0;j<n;j++)
		{
			int power=digits(a[j]);
			int val=(j)*a[j]+(int)Math.pow(10,power)*sum;//0, 314, 1730
			ans+=val;  //0, 314, 2044
			sum+=a[j]; //3, 17, 32
		}
		System.out.println(ans);
	}
	static int digits(int n)
	{
		return Integer.toString(n).length();
	}
}
