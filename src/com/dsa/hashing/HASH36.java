package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH36 {
	public static void main(String as[])
	{// hash 28!
//		Given an array, pick x elements at having y distance.
//		Make the sum minimum.
//		OPTIMAL: TC N, SC N
		int a[]={4,2,5,4,3,5,1,4,2,7},x=3,y=2,n=a.length,minsum=Integer.MAX_VALUE,count=0; //10,3,4,7 | 2 | 3
//		4,2,5,4,3,5,1,4,2,7 | 3 | 2
		Map<Integer,Integer> map=new HashMap<>();
//		PREFIX ARRAY
//		pref[i]=a[i]+a[i-y]+a[i-2*y]+...
		int pref[]=new int[n+1];
		for(int i=0;i<n;i++)
		{
			if(i-y>=1)
				pref[i]=pref[i-y]+a[i];
			else	pref[i]=a[i];
		}
		for(int i=0;i<n;i++)
		{
			int index=i-(x-1)*y;
			if(index>=1)
			{
				int sum=pref[i];
				if(index-y>=1)
					sum-=pref[index-y];
				minsum=Math.min(sum,minsum);
			}
		}
//		pref[i] is not checking for x, hence pref[i]-=pref[i-x*y]
		System.out.println(minsum);
	}
}
