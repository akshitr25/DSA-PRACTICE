package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH23 {
	public static void main(String as[])
	{// hash 23
//		BF, TC N^3, SC 1 
//		Given an array of size “N”; find the number of triplets; such that A[i] >A[j]< A[k] such that i < j < k.
		int a[]= {2,1,3,4,5},n=a.length,count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(a[i]>a[j] && a[j]<a[k])
						count++;
				}
			}
		}
		System.out.println(count);
	}
}
