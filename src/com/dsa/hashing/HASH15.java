package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH15 {
	public static void main(String as[])
	{// hash 18
//		GIVEN AN ARRAY, FIND NO OF SPECIAL PAIRS IN ARRAY.
//		OPTIMAL TC: N, SC: N
//		Cond: i<j and A[A[A[i]]]=A[A[A[j]]]
		int a[]={0,4,2,1,2},n=a.length,count=0;
		Map<Integer,Integer> map=new HashMap<>();
		//LHS AND RHS
		for(int i=1;i<n;i++) //can be <=n when tsking i/p thru console
		{
			int rhs=a[a[a[i]]];
			count+=map.getOrDefault(rhs,0);
			int lhs=a[a[a[i]]];
			map.put(lhs,map.getOrDefault(lhs,0)+1);
		}
		System.out.print(count);
	}
}
