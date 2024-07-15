package com.dsa.twopointer;

import java.util.HashMap;
import java.util.Map;

public class TP15 {
	public static void main(String as[])
	{//TP 11
//		Longest subarray having sum of elements atmost K
//		TC N, SC 1 
		int a[]={8,2,4,0,1,1,0},k=9;
		//1,2,1,0,1,1,0 | 4 | ans=5
		int n=a.length,maxlen=-1,i=0,j=0,sum=0;
		while(i<n && j<n)
		{
			if(i==j)
			{
				if(a[i]>k)
				{
					i++;
					j++;
					if(i<n)
						sum=a[i];
				}
				else
				{
					maxlen=Math.max(maxlen,1);
					j++;
					if(i<n)
						sum+=a[j];
				}
			}
			else
			{
				if(sum>k)
				{
					sum=-a[i];
					i++;
					sum-=a[j];
					j--;
					if(i>j)	j=i;
				}
				else
				{
					maxlen=Math.max(Math.abs(i-j)+1,maxlen);
					sum+=a[j];
					j++;
					if(j<n)
						sum+=a[j];
				}
			}
		}
		System.out.println(maxlen);
	}
}
