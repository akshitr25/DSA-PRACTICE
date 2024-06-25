package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH7 {
	public static void main(String as[])
	{
//		array given, can choose either 2 items of same value, or 3 items of same value. 
//		need min operations and return -1 if there is no soln.
		int a[]= {2,4,6,6,4,2,4};
		int n=a.length;
		Map<Integer,Integer> map=new HashMap<>();
		int count=0;
		for(int i:a)
			map.put(i,map.getOrDefault(i,0)+1);
		for(Map.Entry<Integer,Integer> e: map.entrySet()) 
		{
			int freq=(Integer)e.getValue();
			if(freq==1)
			{
				System.out.println("NOT POSSIBLE");
				return;
			}
			count+=(freq/3+(freq%3==0?0:1)); //covers for freq%2==0 as well.
		}
		System.out.println(count);
	}
}
