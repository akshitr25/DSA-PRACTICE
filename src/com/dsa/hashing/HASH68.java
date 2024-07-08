package com.dsa.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HASH68 {
	public static void main(String as[])
	{// hash 49!
//		P0 :-> Find the sum of all subarrays which are in Arithmetic Progression! Each array element is also an Arithmetic Progression!
//Difference should only be 0 or 1 
//		Optimal TC N, SC 1
//		at each i, calc sum of all valid subarrays till i, and add this to ans.
//		prev+=count*a[i]; (if AP)
		int a[]={1,2,5,0,5,0,5,9,7 },n=a.length,ans=0,sum=0,total=0;
		for(int i:a)	total+=i;
		int count=0,prevsum=0;
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				sum+=a[i];
				prevsum=a[i];
			}
			else
			{
				if(a[i]-a[i-1]==1)
				{
					count++;
					sum=prevsum+a[i]*(count+1);
					prevsum=sum;
				}
				else
				{
					sum=a[i];
					count=0;
					prevsum=a[i];
				}
			}
			ans+=sum;
		}
		sum=0;
		prevsum=0;
		count=0;
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				sum+=a[i];
				prevsum=a[i];
			}
			else
			{
				if(a[i]-a[i-1]==0)
				{
					count++;
					sum=prevsum+a[i]*(count+1);
					prevsum=sum;
				}
				else
				{
					sum=a[i];
					count=0;
					prevsum=a[i];
				}
			}
			ans+=sum;
		}
		System.out.println(ans-total);
	}
}