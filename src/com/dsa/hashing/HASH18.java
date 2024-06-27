package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH18 {
	public static void main(String as[])
	{// hash 20
//		Given an array of size “N” ; find the number of pairs (i,j) such that - 
//		|a[i]-a[j]| + |a[i]+a[j]| = target 
		//BF
//		ai+aj,ai-aj,so 2ai=target && ai <aj
//		ai+aj=target/2
//		for every a[j] see numbers on the left which are lesser than it. i<j
		int a[]={1,4,-1,2},n=a.length,target=4; //1 based indexing
		Map<Integer,Integer> map=new HashMap<>();
//		cl: less than target/2,ct2=no of target/2, and then no of pairs=cl*ct2. and then also add no of pairs of the occurrences of target/2 (n*(n-1)/2). only for target even
//		target odd: 
		int cl=0,ct2=0;
		if(target%2!=0)
		{
			System.out.print(0);
			return;
		}
		for(int i=0;i<n;i++)
		{
			map.put(a[i],map.getOrDefault(a[i],0)+1);
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==target/2)	cl++;
			else if(a[i]<target/2)	ct2++;
		}
		int ans=cl*ct2+cl*(cl-1)/2; //2*1+1*(0)/2=2
		System.out.print(ans);
	}
}
