package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH41 {
	public static void main(String as[])
	{// hash 31!
//		P0: You are given an integer array nums and an integer k.  In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.  Return the maximum number of operations you can perform on the array.
//		Optimal TC N, SC N
		int a[]={1,1,2,2,8,8,8,8,9},n=a.length,k=10; //op=3
		Map<Integer,Integer> map=new HashMap<>();
		Map<Integer,Integer> check=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			map.put(a[i],map.getOrDefault(a[i],0)+1);
		}
		int count=0;
		for(int i:map.keySet()) //iterate over map keys
		{
			int freq=map.get(i);
			int partner=k-i;
			if(check.getOrDefault(i,0)==0 && check.getOrDefault(partner,0)==0)
			{
				if(i==partner)
					count+=map.get(i)/2;
				else
					count+=Math.min(freq,map.get(partner));
				check.put(i,1);
				check.put(partner,1);
			}
		}
		System.out.println(count);
	}
}
