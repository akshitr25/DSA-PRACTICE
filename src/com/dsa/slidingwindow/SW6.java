package com.dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class SW6 {
	public static void main(String as[])
	{
		//COUNT NO OF SUBARRAYS WHICH HAVE SUM IN RANGE OF (L,R)
		//BRUTE FORCE, TC: O(N^2), SC: O(1)
		int a[]= {2,3,5,8};//{1,4,6};
		int l=4,r=13,count=0,sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=0;
			for(int j=i;j<a.length;j++)
			{
				sum+=a[j];
				if(sum>=l)
				{
					if(sum<=r)
					{
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
