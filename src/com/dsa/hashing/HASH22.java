package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH22 {
	public static void main(String as[])
	{// hash 22
//		OPTIMAL, TC N^2, SC N^2
//		Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return the number of tuples (i, j, k, l) such that:
//
//			0 <= i, j, k, l < n
//			nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
//		1 <= n <= 200
//				-2^28 <= nums1[i], nums2[i], nums3[i], nums4[i] <= 2^28
		int nums1[]={1,2},nums2[]= {-2,-1},nums3[]={-1,2},nums4[]={0,2},n=nums1.length,count=0;
//		A1+A2+A3+A4=0
//		A1+A2+A3=-A4 !!!!!
//		A1+A2=-(A3+A4)
		Map<Integer,Integer> map1=new HashMap<>();
//		Map<Integer,Integer> map2=new HashMap<>();
//		Map<Integer,Integer> map3=new HashMap<>();
//		Map<Integer,Integer> map4=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int val=nums1[i]+nums2[j];
				map1.put(val,map1.getOrDefault(val,0)+1);
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int val=0;
				val-=(nums3[i]+nums4[j]);
				if(map1.containsKey(val))
					count++;
			}
		}
		System.out.println(count);
	}
}
