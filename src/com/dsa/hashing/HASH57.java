package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HASH57 {
	public static void main(String as[])
	{// hash 40!
//		Given an array of size N ;  find the maximum sum subarray which has a difference of "k" between the start and end elements of the array
//		ai-aj=k
//		TC N, SC N
		int a[]={1,5,-5,8,8,8,10,15},k=5,n=a.length,ans=-1,sum=0;
		Map<Integer,Integer> map=new HashMap<>(); //val,prefsum right before i
		for(int i=1;i<n;i++)
		{
			int val1=k-a[i];
			if(map.containsKey(val1))
			{
				int bestsum=(sum+a[i])-map.get(val1);
				ans=Math.max(ans,bestsum);
			}
			int val2=k+a[i];
			if(map.containsKey(val2))
			{
				int bestsum=(sum+a[i])-map.get(val2);
				ans=Math.max(ans,bestsum);
			}
			map.put(a[i],Math.min(sum,map.getOrDefault(a[i],0)));
			sum+=a[i];
		}
		
		System.out.println(ans);
	}
}
