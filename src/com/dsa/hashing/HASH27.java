package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH27 {
	public static void main(String as[])
	{// hash 24
//		Given an array arr[] of size N and an integer S, the task is to find the count of quadruplets present in the given array having sum S. 
//		OPTIMAL TC N^2, SC N
		int a[]={4,5,3,1,2,4},n=a.length,target=13;
//		int a[]= {1,5,3,1,2,10},target=20,n=a.length;
		int count=0;
		int i,j,k,l;
		Map<Integer,Integer> map=new HashMap<>();
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				int temp=a[i]+a[j];
				if(temp<target && map.containsKey(target-temp))
					count+=map.get(target-temp);
			}
			for(j=0;j<i;j++)
			{
				int temp=a[i]+a[j];
				if(temp<target)
				{
					if(map.containsKey(temp))
						map.put(temp, map.get(temp)+1);
					if(temp<target)
					{
						if(map.containsKey(temp))
							map.put(temp,map.get(temp)+1);
						else
							map.put(temp, 1);
					}
				}
			}
		}
		System.out.println(count);
	}
}
