package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HASH55 {
	public static void main(String as[])
	{// hash 38! My approach, Yes or NO?
//		Given an array of size “N” ; find the maximum sum subarray which has the same elements in the start and end. 
//		BF TC N, SC N
//		k=pref[i-1]+a[j], j fixed, so make a[i-1] MIN
		int a[]={1,8,10,8,-5,8},n=a.length,ans=-1,sum=0; //maxsum should be 29
		Map<Integer,Integer> map=new HashMap<>();
		int pref[]=new int[n+1];
//		value, prefsum excluding that val; (1 pos before that index)
		map.put(a[0],1);
		for(int i=1;i<n;i++)
		{
			ans=Math.max(ans,a[i]);
			if(map.containsKey(a[i]))
			{
				int bestsum=sum+a[i]-map.get(a[i]);
				ans=Math.max(ans,bestsum);
				map.put(a[i],Math.min(sum,map.get(a[i])));
			}
			else
				map.put(a[i],pref[i-1]);
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
