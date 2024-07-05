package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HASH61 {
	public static void main(String as[])
	{// hash 42!
//		Find the number of nice subarrays
//		A continuous subarray is called nice if there are k odd numbers on it.
//		TC N, SC N
		int a[]={1,1,2,1,1},k=3,n=a.length,ans=0,count=0;
//		8,2,1,3,4,5,1,10 | 3
		Map<Integer,Integer> map=new HashMap<>();
		map.put(0,1);
		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0)
			{
				count++;
			}
			if(map.containsKey(count-k))
			{
				ans+=map.get(count-k);
			}
			map.put(count,map.getOrDefault(count,0)+1);
		}
		System.out.println("ODD NO.S | COUNT");
		for(int i:map.keySet())
			System.out.println(i+"\t"+map.get(i));
		System.out.println(ans);
	}
}
