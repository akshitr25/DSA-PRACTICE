package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH35 {
	public static void main(String as[])
	{// hash 28!
//		Given an array, pick x elements at having y distance.
//		Make the sum minimum.
//		BF: TC N^2, SC 1
		int a[]={4,2,5,4,3,5,1,4,2,7},x=3,y=2,n=a.length,minsum=Integer.MAX_VALUE,count=0; //10,3,4,7 | 2 | 3
//		4,2,5,4,3,5,1,4,2,7 | 3 | 2
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int j=i;
			int sum=0;
			count=0;
			while(j>=0 && count<=x)
			{
				sum+=a[j];
				count++;
				j=j-y;
			}
			if(count==x)	minsum=Math.min(minsum,sum);
		}
		System.out.println(minsum);
	}
}
