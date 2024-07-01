package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH46 {
	public static void main(String as[])
	{// hash 33!
//		Count the number of mountain subarrays(length>=3) in the array 
//		1<=N<=100000
//		1<=A[i]<=100000000
//		mountain array: initially, strictly increasing, then strictly decreasing
//		BF TC SC
		int a[]= {1,2,4,2,1},n=a.length;//op=4, {1,2,4,2,1},{1,2,4,2},{2,4,2},{2,4,2,1}
		int pref[]=new int[n+1],suff[]=new int[n+1],maxinc=-1,maxdec=-1;
//		two parts: find longest increasing subarray which ends at index i, and the longest decreasing subarray which starts at index i
//		part1 (increasing subarray)
		for(int i=1;i<n;i++)
		{
			if(a[i-1]<a[i])
			{
				pref[i]=pref[i-1]+1;//longest strictly increasing subarray which ends at index i
			}
			else
			{
				pref[i]=1;
			}
			maxinc=Math.max(pref[i],maxinc);
		}
//		part 2 (decreasing subarray
		for(int i=n-2;i>=0;i--)
		{
			if(a[i]>a[i+1])
				suff[i]=suff[i+1]+1;
			else
				suff[i]=1;
			maxdec=Math.max(suff[i],maxdec);
		}
		System.out.println(maxinc*maxdec);
	}
}
