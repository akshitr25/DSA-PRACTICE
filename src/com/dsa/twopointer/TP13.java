package com.dsa.twopointer;

import java.util.HashMap;
import java.util.Map;

public class TP13 {
	public static void main(String as[])
	{//TP 8
//		Find the smallest subarray which has all the numbers coming in it from L to R at least one time; other numbers are also allowed to come but the fixed condition is that all numbers from L to R should be coming at least one time.
//		Optimal TC N+N,SC R-L+1=>R-L=>N
		int a[]={2,1,4,3,2,1,1,4},l=2,r=4; //8,2,1,2,3,4,5,8 | 2,5 |
		int n=a.length,minlen=Integer.MAX_VALUE,i=0,j=0;
		Map<Integer,Integer> map=new HashMap<>();
		while(i<n & j<n)
		{
			if(a[j]>=l && a[j]<=r)
				map.put(a[j],map.getOrDefault(a[j],0)+1);
			if(map.size()==Math.abs(r-l+1))
			{
				minlen=Math.min(minlen,Math.abs(j-i+1));
				if(a[i]>=l && a[i]<=r)
				{
					map.put(a[i],map.getOrDefault(a[i],0)-1);
					if(map.get(a[i])==0)
						map.remove(a[i]);
				}
				i++;
				if(a[j]>=l && a[j]<=r)
				{
					map.put(a[j],map.getOrDefault(a[j],0)-1);
				if(map.get(a[j])==0)
					map.remove(a[j]);
				}
			}
			else	
				j++;
		}
		if(minlen==Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(minlen);
	}
}
