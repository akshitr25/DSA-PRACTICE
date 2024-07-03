package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH49 {
	public static void main(String as[])
	{// hash 36!
//		P0: 
//		GIVEN AN ARRAY AND INT K, FIND MAX NO OF PAIRS WHOSE SUM IS K.
//		ONE ELEMENT CAN ONLY BE IN 1 PAIR AT MOST
//		can also do by using a check hashmap instead of putting value as 0
		int a[]={1,1,2,2,8,8,8,8,9};
		int n=a.length,k=10,count=0;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i:a)
		{
			map.put(i,map.getOrDefault(i,0)+1);
		}
		for(int i:map.keySet())
		{
			int find=k-i;
			if(i!=find)
				count+=Math.min(map.get(i),map.get(find));
			else	count+=map.get(i)/2;
			map.put(i,0);
			map.put(find,0);
		}
		System.out.println(count);
	}
}