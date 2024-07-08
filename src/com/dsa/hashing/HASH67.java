package com.dsa.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HASH67 {
	public static void main(String as[])
	{// hash 49!
//		P0 :-> Find the sum of all subarrays which are in Arithmetic Progression! Each array element is also an Arithmetic Progression!
//Difference should only be 0 or 1 
//		BF TC N^2, SC 1
		int a[]={5,8,8,10,11,12},n=a.length,sum=0,ans=a[0],total=0;
		for(int i:a)	total+=i;
		for(int i=1;i<n;i++) //FOR D=1
		{
			sum=a[i];
			ans+=sum;
			for(int j=i+1;j<n;j++)
			{
				int d=a[j]-a[j-1];
				if(d==1)
				{
					sum+=a[j-1];
					ans+=sum;
				}
				else
				{
					break;
				}
			}
		}
		for(int i=1;i<n;i++) //FOR D=0
		{
			sum=a[i];
			ans+=sum;
			for(int j=i+1;j<n;j++)
			{
				int d=a[j]-a[j-1];
				if(d==0)
				{
					sum+=a[j-1];
					ans+=sum;
				}
				else
				{
					break;
				}
			}
		}
		System.out.println(ans-total);
	}
}