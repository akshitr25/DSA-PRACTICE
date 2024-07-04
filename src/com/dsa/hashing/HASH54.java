package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HASH54 {
	public static void main(String as[])
	{// hash 38! My approach, Yes or NO?
//		Given an array of size “N” ; find the maximum sum subarray which has the same elements in the start and end. 
//		BF TC N, SC N
//		pref[i-1]+a[i]
		int a[]={1,8,10,8,-5,8},n=a.length,sum=0,max=-1; //maxsum should be 29
		Map<Integer,Integer> map=new HashMap<>();
		int pref[]=new int[n+1];
		pref[0]=a[0];
		for(int i=1;i<n;i++)
		{
			pref[i]=pref[i-1]+a[i];
			map.put(i,a[i]);
		}
		int i=1,j=1;
		while(j<n)
		{
			sum=0;
			if(a[i]==a[j])
			{
				sum=pref[j]-pref[i-1];
				j++;
			}
			else
				j++;
			max=Math.max(max,sum);
		}
		System.out.println(max);
	}
}
