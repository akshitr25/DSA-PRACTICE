package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH33 {
	public static void main(String as[])
	{// hash 27!
//		P0: Given an array, find the shortest subarray such that the sum of first and last element of subarray is k, AND ITS SIZE>=2
//		ai+aj=k
//		ai=k-aj *****
//		Optimal: TC , SC 
		int a[]={5,6,7,8,10,4,3,2,1},k=8,minlen=Integer.MAX_VALUE,n=a.length;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int val=k-a[i];
			if(map.containsKey(val))
			{
				minlen=Math.min(i-map.get(val)+1,minlen);
			}	
			else
			{
				map.put(a[i],i);
			}
		}
		System.out.println(minlen);
	}
}
