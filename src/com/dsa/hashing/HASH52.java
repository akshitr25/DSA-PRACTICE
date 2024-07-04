package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HASH52 {
	public static void main(String as[])
	{// hash 37!
//		Given an array and int k. Find no of pairs (i,j) such that a[i]+a[j} is divisible by k.
//		(ai+aj)%k=>(ai%k+aj%k)%k=>ai%k=-aj%k
//		TC N, SC min(N,K)
		Scanner sc =new Scanner(System.in);
		int a[]={5,2,3,1,1},k=3,n=a.length,count=0;
//		5,2,3,1,1 | 3
//		31,25,85,29,35 | 60
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int val=k-a[i]%k;
			if(map.containsKey(val %k)) //can use val directly.
			{
				count+=map.get(val %k);
			}
			map.put(a[i]%k,map.getOrDefault(a[i]%k,0)+1);
		}
		System.out.println(count);
	}
}
