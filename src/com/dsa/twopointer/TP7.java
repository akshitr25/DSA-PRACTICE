package com.dsa.twopointer;

import java.util.HashMap;
import java.util.Map;

public class TP7 {
	public static void main(String as[])
	{ //FIND LONGEST SUBARRAY WHICH HAS DISTINCT NUMBERS (BRUTE FORCE)
		int n=9,maxlen=0;  
		int a[]= {3,2,4,5,2,6,7,8,9,10};
		Map<Integer,Integer> freq=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			freq.clear();
			for(int j=i;j<n;j++)
			{
				if(!freq.containsKey(a[j]))
				{
					freq.put(a[j],1);
					int len=j-i+1;
					maxlen=Math.max(len, maxlen);
				}
				else	break;
			}
		}
		System.out.println(maxlen);
	}
}
