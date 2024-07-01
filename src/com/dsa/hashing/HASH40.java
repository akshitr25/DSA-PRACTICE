package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH40 {
	static int a[]= {3,14,15},n=a.length,sum=0,val=0,ans=0;
	public static void main(String as[])
	{// hash 30!
//		Given an array of +ve integers, calculate sum of every possible a[i].a[j], where a[i].a[j] is the concatenation of a[i] and a[j].
//		Optimal: TC N, SC 1
		int digit[]=new int[10],right=0;
		for(int i=0;i<n;i++)
		{
			int u=digits(a[i]);
			digit[u]++;
			right+=a[i];//sum of array
		}
		for(int i=0;i<n;i++)
		{
			int val=0,power=1;
			while(power<=6) //N->10^6 so length of in = 6
			{
				val+=a[i]*Math.pow(10,power)*digit[power];
				power++;
			}
			int left=val;
			ans+=left+right;
		}
		System.out.println(ans);
	}
	static int digits(int n)
	{
		return Integer.toString(n).length();
	}
}
