package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH21 {
	public static void main(String as[])
	{// hash 22
//		BF, TC N^4, SC 1
//		Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return the number of tuples (i, j, k, l) such that:
//
//			0 <= i, j, k, l < n
//			nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
//		1 <= n <= 200
//				-2^28 <= nums1[i], nums2[i], nums3[i], nums4[i] <= 2^28
		int nums1[]={1,2},nums2[]= {-2,-1},nums3[]={-1,2},nums4[]={0,2},n=nums1.length,count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					for(int l=0;l<n;l++)
					{
						if(nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0)
						{
							count++;
						}
					}
				}
			}
		}
//		Map<Character,Integer> map1=new HashMap<>();
//		Map<Character,Integer> map2=new HashMap<>();
//		Map<Character,Integer> map3=new HashMap<>();
//		Map<Character,Integer> map4=new HashMap<>();
		System.out.println(count);
	}
}
