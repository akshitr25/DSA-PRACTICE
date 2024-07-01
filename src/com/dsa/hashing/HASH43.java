package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH43 {
	public static void main(String as[])
	{// hash 32!
//		P0: You are given a 0-indexed integer array nums.
//		Return the maximum value over all triplets of indices (i, j, k) such that i < j < k.
//		If all such triplets have a negative value, return 0.
//		The value of a triplet of indices (i, j, k) is equal to (nums[i] - nums[j]) * nums[k].
//		BF TC N^3 SC 1
		int a[]={12,6,1,2,7},n=a.length,max=0;
//		5,4,3,2,1
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    int val=(a[i]-a[j])*a[k];
                    max=Math.max(val,max);
                }
            }
        }
		System.out.println(max);
	}
}
