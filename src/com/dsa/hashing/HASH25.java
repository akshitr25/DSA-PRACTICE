package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH25 {
	public static void main(String as[])
	{// hash 23
//		FOLLOW UP
//		OPTIMAL, TC N^2, SC 2*N->N 
//		Given an array of size “N”; find the number of quadruplets; such that A[i] > A[j] < A[k] >A[l] such that i < j < k < l | N<=1000
		int a[]= {1,2,1,5,1,34,35},n=a.length,count=0;
//		pref[j]: no of pairs where a[i]>a[j] and j is fixed.
//		suff[k]: no of pairs where a[k]>a[l] and k fixed
//		iterate of j and k. ie they're fixed
//		ans will be sum of all pref[j]*suff[k]
		int suff[]=new int[n+1];
		int pref[]=new int[n+1];
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
		int k=n-1;
		while(k>=0)
		{
			count=0;
			int l=k+1;
			while(l<n)
			{
				if(a[k]>a[l])	count++;
				l++;
			}
			suff[k]=count;
			k--;
		}
		int ans=0;
		j=1;
		while(j<n)
		{
			k=j+1;
			while(k<n)
			{
				if(a[j]<a[k])
					ans+=pref[j]*suff[k];
				k++;
			}
			j++;
		}
		System.out.println(ans);
	}
}
