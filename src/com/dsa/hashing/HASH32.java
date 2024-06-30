package com.dsa.hashing;

import java.util.ArrayList;
import java.util.List;

public class HASH32 {
	public static void main(String as[])
	{// hash 27!
//		Given an array, find the shortest subarray such that the sum of first and last element of subarray is k, AND ITS SIZE>=2
//		BF: TC N^2, SC 1
		int a[]={5,6,7,8,10,4,3,2,1},k=8,minlen=Integer.MAX_VALUE,n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int val=a[j]+a[i];
				if(val==k)	minlen=Math.min(j-i+1,minlen);
			}
		}
		System.out.println(minlen);
	}
}
