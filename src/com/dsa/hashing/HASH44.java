package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH44 {
	public static void main(String as[])
	{// hash 32!
//		P0: You are given a 0-indexed integer array nums.
//		Return the maximum value over all triplets of indices (i, j, k) such that i < j < k.
//		If all such triplets have a negative value, return 0.
//		The value of a triplet of indices (i, j, k) is equal to (nums[i] - nums[j]) * nums[k].
//		OPTIMAL TC n^2, SC N 
		int a[]={12,6,1,2,7},n=a.length,max=0,ans=0;
//		5,4,3,2,1
//		pref[i]=max value of a[i]-a[j] from 0 to i
//		pref[i]=Math.max(max,a[i]-a[j])
		int pref[]=new int[n+1];
		pref[1]=a[0]-a[1];
		for(int k=2;k<n;k++)
        {
			max=pref[k-1];
			int i=k-1;
			while(i>=0)
			{
				max=Math.max(max,a[i]-a[k]);
				i--;
			}
			pref[k]=max;
			int val=pref[k-1]*a[k];
			ans=Math.max(ans,val);
        }
		System.out.println(ans);
	}
}
