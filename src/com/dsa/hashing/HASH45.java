package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH45 {
	public static void main(String as[])
	{// hash 32!
//		P1: You are given a 0-indexed integer array nums.
//		Return the maximum value over all triplets of indices (i, j, k) such that i < j < k.
//		If all such triplets have a negative value, return 0.
//		The value of a triplet of indices (i, j, k) is equal to (nums[i] - nums[j]) * nums[k].
//		3<=N<=10^5
//		OPTIMAL TC N, SC N 
		int a[]={12,6,1,2,7},n=a.length,max=0,ans=0;
//		5,4,3,2,1
//		pref[i]=max value of a[i]-a[j] from 0 to i
//		pref[i]=Math.max(max,a[i]-a[j])
		int d=Math.max(a[0],a[1]); //min value till index i
		int pref[]=new int[n+1];
		pref[1]=a[0]-a[1];
		for(int i=2;i<n;i++)
        {
			pref[i]=Math.max(pref[i-1],d-a[i]);
			max=Math.max(max,a[i]*pref[i-1]);
			d=Math.max(d,a[i]);
        }
		System.out.println(max);
	}
}
