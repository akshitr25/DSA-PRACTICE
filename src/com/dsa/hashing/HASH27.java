package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH27 {
	public static void main(String as[])
	{// hash 24
//		Given an array arr[] of size N and an integer S, the task is to find the count of quadruplets present in the given array having sum S. 
//		BF TC N^4, SC 1
//		int a[]={4, 5, 3, 1, 2, 4},n=a.length,target=13;
		int a[]= {1,5,3,1,2,10},target=20,n=a.length;
		int count=0;
		Map<Integer,Integer> map1=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int val=a[i]+a[j];
				map1.put(val,map1.getOrDefault(val,0)+1);
			}
		}
		for(int k=0;k<n;k++)
		{
			for(int l=k+1;l<n;l++)
			{
				int val=0;
				val=target-(a[k]+a[l]);
				if(map1.containsKey(val))
					count+=map1.get(val);
			}
		}
		System.out.println(count);
	}
}
