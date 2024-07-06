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
		int a[]={1,3,4,1,2,3,1},n=a.length,max=Integer.MIN_VALUE;
		List<List<Integer>> ans=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			boolean ins=false;
			for(int j=0;j<ans.size();i++)
			{
				boolean ch=false;
				for(int k=0;k<ans.size();k++)
				{
					if(a[i]==ans.get(j).get(k))
						ch=true;
				}
				if(!ch)
				{
					ans.get(j).add(a[i]);
					ins=true;
					break;
				}
			}
			if(!ins)
			{
				List<Integer> list=new ArrayList<>();
				list.add(a[i]);
				ans.add(list);
			}
		}
		System.out.println(ans);
		
	}
}
