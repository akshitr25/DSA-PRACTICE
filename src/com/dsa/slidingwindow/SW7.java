package com.dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class SW7 {
	public static void main(String as[])
	{
		//COUNT NO OF SUBARRAYS WHICH HAVE SUM IN RANGE OF (L,R)
		//OPTIMAL TC:O(N), SC:O(1)
		int a[]= {2,3,5,8},n=4;//{1,4,6};
		int l=4,r=13,count=0,sum=0;
		System.out.println(countSubarray(n,a,l,r));
	}
	public static int count(int n,int[] a,int target)
	{
		int ans=0;
		int sum=0;
		for(int l=0,r=0;r<n;r++)
		{
			sum+=a[r];
			while(sum>target)
			{
				sum-=a[l];
				l++;
			}
			ans+=r-l+1;
		}
		return ans;
	}
	public static int countSubarray(int n,int[] a,int l,int r)
	{
		int ans1=count(n,a,l-1);
		int ans2=count(n,a,r);
		return ans2-ans1;
	}
}
