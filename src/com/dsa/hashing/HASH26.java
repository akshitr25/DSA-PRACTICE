package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH26 {
	public static void main(String as[])
	{// hash 24
//		Given an array arr[] of size N and an integer S, the task is to find the count of quadruplets present in the given array having sum S. 
//		BF TC N^4, SC 1
		int a[]={4, 5, 3, 1, 2, 4},n=a.length,count=0,target=13;//{1,5,3,1,2,10},20
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					for(int l=k+1;l<n;l++)
					{
						if(a[i]+a[j]+a[k]+a[l]==target)	count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
