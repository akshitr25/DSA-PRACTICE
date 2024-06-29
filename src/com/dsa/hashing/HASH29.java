package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH29 {
	public static void main(String as[])
	{// hash 25!
//		Given 5 arrays :- A,B,C,D,E  all of size “N” 
//		Element in the array can range from [-10^9……….10^9]
//		Find the number of tuplets (i,j,k,l,m) such that  - 
//		a[i] + b[j] + c[k] + d[l] + e[m] = 0
		// ai+bj+ck=-(dl+em)
//		Better: TC N^3 SC N^2
		int a[]={2,5},b[]= {3,8},c[]= {-5,8},d[]= {5,10},e[]= {-10,100};
		int count=0,n=a.length;
		Map<Integer,Integer> map1=new HashMap<>();
		Map<Integer,Integer> map2=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int sum=a[i]+b[j];
				map1.put(sum,map1.getOrDefault(sum,0)+1);
			}
		}
		for(int k=0;k<n;k++)
		{
			for(int l=0;l<n;l++)
			{
				for(int m=0;m<n;m++)
				{
					int sum=c[k]+d[l]+e[m];
					if(map1.containsKey(0-sum))
						count++;
				}
			}
		}	
		System.out.println(count);
	}
}
