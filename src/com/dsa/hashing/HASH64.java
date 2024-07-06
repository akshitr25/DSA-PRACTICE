package com.dsa.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HASH64 {
	public static void main(String as[])
	{// hash 46!
//		You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:
//		The 2D array should contain only the elements of the array nums.
//		Each row in the 2D array contains distinct integers.
//		The number of rows in the 2D array should be minimal.
		int a[]= {1,3,4,1,2,3,1},n=a.length,max=0;
//		for(int i=0;i<200;i++)
//			a[i]=200;
//		1,3,4,1,2,3,1
		Map<Integer,Integer> map=new HashMap<>();
		for(int i:a)
		{
			map.put(i,map.getOrDefault(i,0)+1);
			max=Math.max(max,map.get(i));
		}
		List<List<Integer>> ans=new ArrayList<>();
		for(int i=1;i<=max;i++)
			ans.add(new ArrayList<>());
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<ans.size();j++)
			{
				if(!ans.get(j).contains(a[i]))
				{
					ans.get(j).add(a[i]);
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
