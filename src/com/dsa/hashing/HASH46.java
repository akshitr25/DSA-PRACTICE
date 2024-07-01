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
//		BF TC N SC N
		int a[]= {1,2,4,2,1},n=a.length;//op=4, {1,2,4,2,1},{1,2,4,2},{2,4,2},{2,4,2,1}
		int pref[]=new int[n+1],suff[]=new int[n+1];
//		two parts: find longest increasing subarray which ends at index i, and the longest decreasing subarray which starts at index i
//		part 2 (decreasing subarray)
		suff[n-1]=1;
		for(int i=n-2;i>=0;i--)
		{
			if(a[i]>a[i+1])
				suff[i]=suff[i+1]+1;
			else
				suff[i]=1;
		}
//		part1 (increasing subarray) (w/o prefix array)
		int count=0,ans=0;
		for(int i=1;i<n;i++)
		{
			if(a[i]>a[i-1])
			{
				count++;//longest strictly increasing subarray which ends at index i
			}
			else
			{
				count=1;
			}
			ans=ans+(count-1)*(suff[i]-1);//count*suff[i];
		}
		System.out.println(ans);
	}
}
