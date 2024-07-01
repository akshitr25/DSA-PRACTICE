package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH42 {
	public static void main(String as[])
	{// hash 31!
//		P1: Given an array, group the numbers into pairs such that the sum of the elements of each pair is same. Each element can be a part of utmost 1 pair only. It is not necessary for all elements to be part of some pair.
//		Optimal TC N^3, SC N 
//		possible values of k are only going to be sums of pairs in array
		int a[]={1,1,2,2,8,8,8,8,9},n=a.length; 
		int ans=0;//,nk=(int)(2*Math.pow(10,4));
		Map<Integer,Integer> map=new HashMap<>();
		int i=0;
		while(i<n)
		{
			int j=0;
			while(j<n)
			{
				int k=a[i]+a[j];
				int pairs=calcPairs(a,k);
				ans=Math.max(ans,pairs);
				j++;
			}
			i++;
		}
		System.out.println(ans);	
	}
	static int calcPairs(int a[],int k)
	{
		Map<Integer,Integer> map=new HashMap<>();
		Map<Integer,Integer> check=new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			map.put(a[i],map.getOrDefault(a[i],0)+1);
		}
		int count=0;
		for(int i:map.keySet()) //iterate over map keys
		{
			int freq=map.get(i);
			int partner=k-i;
			if(check.getOrDefault(i,0)==0 && check.getOrDefault(partner,0)==0)
			{
				if(i==partner)
					count+=map.get(i)/2;
				else
					count+=Math.min(freq,map.getOrDefault(partner,0));
				check.put(i,1);
				check.put(partner,1);
			}
		}
		return count;
	}
}
