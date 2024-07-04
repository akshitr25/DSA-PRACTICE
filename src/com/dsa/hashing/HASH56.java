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
		int a[]={1,1,1,2},k=1,n=a.length;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			map.put(a[i],map.getOrDefault(a[i],0)+1);
		}
		int ans=0;
		for(Map.Entry e:map.entrySet())
		{
			int key=(int)e.getKey();
			int value=(int)e.getValue();
			if(k==0)
			{
				if(value>1)	ans++;
			}
			else
			{
				if(map.containsKey(key+k))
					ans++;
			}
		}
		System.out.println(ans);
	}
}
