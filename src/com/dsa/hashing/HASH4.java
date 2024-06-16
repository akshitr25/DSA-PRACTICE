package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH4 {
	public static void main(String as[])
	{
		int maxlen=0;
		int nums[]=new int[]{98,99,100,1,4,3,2,7,8,6,5};
		Map<Integer,Boolean> present=new HashMap<>();
		for(int i:nums)
			present.put(i,true);
		Map<Integer,Boolean> checked=new HashMap<>();
		for(int i:nums)
		{
			if(!present.containsKey(i-1)&& !checked.containsKey(i))
			{
				int currentlen=0;
				int start=i;
				while(present.containsKey(start))
				{
					currentlen++;
					checked.put(start,true);
					start++;
				}
				maxlen=Math.max(maxlen, currentlen);
			}
		}
		System.out.println("LONGEST CONSECUTIVE SUBARRAY LENGTH: "+maxlen);
	}
}
