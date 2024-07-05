package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HASH59 {
	public static void main(String as[])
	{// hash 42!
//		Find the number of subarrays such that their maximum is K
//		BF TC N^2, SC 1
		int a[]={8,2,1,3,4,5,1,10},k=3,n=a.length,count=0;
//		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int max=a[i]; //can be Integer.MIN_VALUE as well
			for(int j=i;j<n;j++)
			{
				max=Math.max(max,a[j]);
				if(max==k)	count++;
			}
		}
		System.out.println(count);
	}
}
