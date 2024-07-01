package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH39 {
	static int a[]= {3,14,15},n=a.length,sum=0;
	public static void main(String as[])
	{// hash 30!
//		Given an array of +ve integers, calculate sum of every possible a[i].a[j], where a[i].a[j] is the concatenation of a[i] and a[j].
//		BF: TC N^2, SC 1
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int power=digits(a[j]);
				sum+=Math.pow(10,power)*a[i]+a[j];
			}
		}
		System.out.println(sum);
	}
	static int digits(int n)
	{
		return Integer.toString(n).length();
	}
}
