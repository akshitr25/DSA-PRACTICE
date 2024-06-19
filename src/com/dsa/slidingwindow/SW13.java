package com.dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class SW13 {
	public static void main(String as[])
	{
//		OPTIMAL TC:O(N), SC:O(1)
		int a[]= {1,2,7, 7,4,3, 6}; //{7,4,3} subarray is having maxsum and has no duplicate in it.
		int k=3,i=0,j=0,n=a.length,sum=0,ans=-1;
		Map<Integer,Integer> freq=new HashMap<>();
		while(j<n)
		{
			sum+=a[j];
			freq.put(a[j],freq.getOrDefault(a[j],0)+1);
			if(j-i+1<k)	j++;
			else if(j-i+1==k)
			{
				if(freq.size()==k)
				{
					ans=Math.max(ans, sum);
				}
				sum-=a[i];
				freq.put(a[i],freq.get(a[i])-1);
				if(freq.get(a[i])==0)	
					freq.remove(a[i]);
				i++;
				j++;
			}
		}
		System.out.println(ans);
	}
//	public static int[] moveZeroes(int a[])
//	{
//		int start=0,end=0,n=a.length;
//		while
//		return a;
//	}
}