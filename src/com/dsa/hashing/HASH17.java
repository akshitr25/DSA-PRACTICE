package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH17 {
	public static void main(String as[])
	{// hash 20

		int a[]={1,4,-1,2},n=a.length,target=4,count=0; //1 based indexing
		Map<Integer,Integer> map=new HashMap<>();
//		Given an array of size “N” ; find the number of pairs (i,j) such that - 
//		|a[i]-a[j]| + |a[i]+a[j]| = target 
		//BF, TC N^2, SC 1
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(Math.abs(a[i]-a[j])+Math.abs(a[i]+a[j])==target)
					count++;
			}
		}
		System.out.print(count);
	}
}
