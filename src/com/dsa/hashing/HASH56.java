package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HASH56 {
	public static void main(String as[])
	{// hash 39!
//		GIVEN AN ARRAY AND INT K, COUNT NO OF DISTINCT VALID PAIRS (a,b) for which a+k=b.
//		two pairs (a,b) and (c,d) are distinct if at least 1 element of (a,b) does not belng to (c,d).
//		TC N, SC N
		int a[]={1,1,1,2},k=1,n=a.length,count=0;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int find=a[i]-k;
			if(map.containsKey(find))
			{
				count++;
			}
			map.put(a[i],map.getOrDefault(a[i],0)+1);
		}
		System.out.println(count);
	}
}
