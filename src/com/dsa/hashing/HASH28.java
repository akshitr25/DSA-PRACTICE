package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH28 {
	public static void main(String as[])
	{// hash 25!
//		Given 5 arrays :- A,B,C,D,E  all of size “N” 
//		Element in the array can range from [-10^9……….10^9]
//		Find the number of tuplets (i,j,k,l,m) such that  - 
//		a[i] + b[j] + c[k] + d[l] + e[m] = 0
//		BF: TC N^5 SC 1
		int a[]={2,5},b[]= {3,8},c[]= {-5,8},d[]= {5,10},e[]= {-10,100};
		int count=0,n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					for(int l=0;l<n;l++)
					{
						for(int m=0;m<n;m++)
						{
							if(a[i] + b[j] + c[k] + d[l] + e[m] == 0)
								count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
