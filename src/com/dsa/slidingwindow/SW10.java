package com.dsa.slidingwindow;

public class SW10 {
	public static void main(String as[])
	{
//		COUNT NO OF SUBARRAYS W SUM==K
//		OPTIMAL TC:O(N), SC:O(1)
		int a[]={1,10,2,3,7,15,10};
		int k=10;
		System.out.println(subarraysWithSumK(a,k));
	}
	public static int subarraysWithSumK(int a[],int k)
	{
		int count=0,start=0,end=0,n=a.length,sum=0;
		for(end=0;end<n;end++)
		{
			sum+=a[end];
			while(sum>k && start<=end)
			{
				sum-=a[start];
				start++;
			}
			if(sum==k)	count++;
		}
		return count;
	}
}