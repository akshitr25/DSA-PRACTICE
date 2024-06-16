package com.dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class SW6 {
	public static void main(String as[])
	{ //FIND LONGEST SUBARRAY WHICH HAS DISTINCT NUMBERS
		int n=9,maxlen=0; 
		int a[]= {1,3,8,4,8,2,10};
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
