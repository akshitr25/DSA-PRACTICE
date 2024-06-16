package com.dsa.twopointer;

import java.util.HashMap;
import java.util.Map;

public class TP8 {
	public static void main(String as[])
	{ //FIND LONGEST SUBARRAY WHICH HAS DISTINCT NUMBERS (OPTIMAL)
		int n=10,maxlen=0,i=0,j=0;  
		int a[]= {3,2,4,5,2,6,7,8,9,10};
		Map<Integer,Integer> index=new HashMap<>();
		while(i<n && j<n)
		{
			if(!index.containsKey(a[j]))
			{
				index.put(a[j],j);
				int len=j-i+1;
				maxlen=Math.max(maxlen,len);
				j++;
			}
			else
			{
				int idx=index.get(a[j]);
				while(i<=idx)
				{
					index.remove(a[i]);
					i++;
				}
				i=idx+1;
				index.put(a[j],1);
				j++;
			}
		}
		System.out.println(maxlen);
	}
}
