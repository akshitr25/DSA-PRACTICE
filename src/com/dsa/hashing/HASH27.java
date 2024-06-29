package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH27 {
	public static void main(String as[])
	{// hash 24
//		Given an array arr[] of size N and an integer S, the task is to find the count of quadruplets present in the given array having sum S. 
//		BF TC N^4, SC 1
		int a[]={4,5,3,1,2,4},n=a.length,target=13;
//		int a[]= {1,5,3,1,2,10},target=20,n=a.length;
		int count=0,ans=0;
//		Map<Integer,Integer> map1=new HashMap<>();
		int i,j,k,l;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n-2;j++)
			{
				int req=target-a[i]-a[j];
				Map<Integer,Integer> map=new HashMap<>();
				for(k=j+1;k<n;k++)
				{
					if(map.containsKey(a[k]))
						map.put(a[k],map.get(a[k])+1);
					else
						map.put(a[k],1);
				}
				int count2x=0;
				for(k=j+1;k<n;k++)
				{
					if(map.containsKey(req-a[k]))
						count2x+=map.get(req-a[k]);
					if(req-a[k]==a[k])	
						count2x--;
				}
				count+=count2x/2;
			}
		}
		System.out.println(count);
	}
}
