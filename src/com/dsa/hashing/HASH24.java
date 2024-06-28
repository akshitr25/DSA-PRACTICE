package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH24 {
	public static void main(String as[])
	{// hash 23
//		P0 a[i]>a[j]
//		OPTIMAL, TC N^2, SC 2*N->N 
//		Given an array of size “N”; find the number of triplets; such that A[i] >A[j]< A[k] such that i < j < k.
		int a[]= {2,1,3,4,5},n=a.length,count=0;
//		pref[i]: no of pairs where a[i]>a[j] and j is fixed.
//		suff[i]: no of pairs where a[j]<a[k] and j fixed
		int pref[]=new int[n+1];
		int suff[]=new int[n+1];
		int j=1;
		while(j<n)
		{
			int i=0;
			while(i<j)
			{
				if(a[i]>a[j])	count++;
				i++;
			}
			pref[j++]=count;
		}
		suff[n-1]=0;
		j=n-1;
		while(j>=1)
		{
			count=0;
			int k=j+1;
			while(k<n)
			{
				if(a[j]<a[k])	count++;
				k++;
			}
			suff[j--]=count;
		}
		int ans=0;
		for(int i=0;i<n;i++)
		{
			ans+=pref[i]*suff[i];
		}
		System.out.println(ans);
	}
}
