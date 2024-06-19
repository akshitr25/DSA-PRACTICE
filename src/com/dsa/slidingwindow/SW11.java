package com.dsa.slidingwindow;

public class SW11 {
	public static void main(String as[])
	{
//		COUNT NO OF SUBARRAYS W SUM>=K
//		OPTIMAL TC:O(N), SC:O(1)
		int a[]= {1,11,2,3,15};
		int k=10;
		System.out.println(subarraysWithGteSumK(a,k));
	}
	public static int subarraysWithGteSumK(int a[],int k)
	{
		int count=0,start=0,end=0,n=a.length,sum=0;
		while(end<n)
		{
			sum+=a[end];
			if(sum<k)	end++;
			else if(sum>=k)
			{
				while(sum>=k && start<=end)
				{
					count+=n-end;
					sum-=a[start];
					start++;
				}
				end++;
			}
		}
		return count;
	}
}