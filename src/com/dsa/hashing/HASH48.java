package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH48 {
	public static void main(String as[])
	{// hash 35!
//		GIVEN AN ARRAY, FIND SUBSET OF ARRAY WITH PROPERTY:
//		all adjacent elements should follow:
//			s[2]-s[1]=pos[2]-pos[1]...
//			s[i]-s[i-1]=pos[i]-pos[i-1]
//		AND SUM OF THAT SUBSET SHOULD BE MAX
//		TC N, SC N
//		s[i]-s[i-1]=pos[i]-pos[i-1]
//		=>s[i]-pos[i]=s[i-1]-pos[i-1]
//		s[i]+i==s[j]+j
		int a[]={1,5,3,7,8},n=a.length,max=-1;
//				 1 4 1 4 4 
//		List<Integer> list=new ArrayList<>();
		Map<Integer,Integer> map=new HashMap<>(); //a[i]-i, a[i](SUM OF ALL ELEMENTS satisfying condition)
		for(int i=0;i<n;i++)
		{
			int val=a[i]-i;
			map.put(val,map.getOrDefault(val,0)+a[i]);
			max=Math.max(map.get(val),max);
		}
//		5 7 8 | 2 1
//		1 3 4 | 2 1
		System.out.println(max);
	}
}