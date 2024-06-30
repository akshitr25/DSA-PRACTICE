package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH34 {
	public static void main(String as[])
	{// hash 27!
//		P0: Given an array, find the longest subarray such that the sum of first and last element of subarray is k, AND ITS SIZE>=2
//		ai+aj=k
//		ai=k-aj *****
//		Optimal: TC N, SC N
		int a[]={5,6,7,8,10,4,3,2,1},k=6,maxlen=Integer.MIN_VALUE,n=a.length; //5,8,8,5,1,1,10 | 15
//		5,6,7,8,10,4,3,2,1 | 8
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int val=k-a[i];
			if(map.containsKey(val))
				maxlen=Math.max(i-map.get(val)+1,maxlen);
			else	map.put(a[i],i);
		}
		System.out.println(maxlen);
	}
}
