package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH81 {
	public static void main(String as[])
	{// hash 59
//		Given an array of zeros and ones ; find the number of subarrays which have this property :->
//	(no of zeroes)/(no of ones)= x/y
//		OPTIMAL TC N^2, SC 1
//		zeroes/ones=x/y
//		zeroes*y=ones*x
		int a[]= {1,0,1,1,1,1,1},n=a.length,ans=0,x=1,y=2;
		int pref0[]=new int[n+1];
		int pref1[]=new int[n+1];
		if(a[0]==0)
			pref0[0]=1;
		else
			pref1[0]=1;
		for(int i=1;i<n;i++)
		{
			if(a[i]==0)
			{
				pref0[i]=pref0[i-1]+1;
				pref1[i]=pref1[i-1];
			}
			else
			{
				pref0[i]=pref0[i-1];
				pref1[i]=pref1[i-1]+1;
			}
		}
//		Pref0[j] - Pref0[i-1] / Pref1[j] - Pref1[i-1]  = x/y 
//		(pref0[j] - pref0[i-1])*y = x*(pref1[j] - pref1[i-1])
//		pref0[i-1]*y - pref1[i-1]*x = pref0[j]*y - x*(pref1[j])
		Map<Integer,Integer> map=new HashMap<>();
		int j=1;
		while(j<=n)
		{
			int LHS=pref0[j-1]*y-pref1[j-1]*x;
			map.put(LHS,map.getOrDefault(LHS,0)+1);
			int RHS=pref0[j]*y-pref1[j]*x;
			ans+=map.getOrDefault(RHS,0);
			j++;
		}
		System.out.println(ans);
	}
}