package com.dsa.twopointer;

import java.util.HashMap;
import java.util.Map;

public class TP12 {
	public static void main(String as[])
	{//TP 8
//		Find the smallest subarray which has all the numbers coming in it from L to R at least one time; other numbers are also allowed to come but the fixed condition is that all numbers from L to R should be coming at least one time.
//		BF TC N^2,SC R-L+1
		int a[]={8,2,1,2,3,4,5,8},l=2,r=5;
		int n=a.length,minlen=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			Map<Integer,Integer> map=new HashMap<>();
			int j;
			for(j=i;j<n;j++)
			{
				if(a[j]>=l && a[j]<=r)
					map.put(a[j],map.getOrDefault(a[j],0)+1);
				if(map.size()==Math.abs(r-l+1))
				{
					minlen=Math.min(minlen,Math.abs(j-i+1));
					break;
				}
			}
			
		}
		if(minlen==Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(minlen);
	}
}
