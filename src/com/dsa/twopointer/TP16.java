package com.dsa.twopointer;

import java.util.HashMap;
import java.util.Map;

public class TP16 {
	public static void main(String as[])
	{//TP 12
//		Given an array of numbers which are sorted find the largest subarray such that the difference between abs(maximum-minimum)<=K 
//		TC N, SC 1
		int a[]={ 5,9,20,22,28,35, 60,350,358,359,360},k=30;
		int n=a.length,maxlen=-1,i=0,j=1,sum=0,max=a[0],min=a[0],diff=-1;
		while(i<n && j<n)
		{
			if(i==j)
			{
				diff=0;
				if(diff>k)
				{
					i++;
					j++;
					if(i<n)
						diff=a[j]-a[i];
				}
				else
				{
					maxlen=Math.max(maxlen,1);
					j++;
					if(j<n)
						diff=a[j]-a[i];
				}
			}
			else
			{
				diff=a[j]-a[i];
				if(diff>k)
				{
					int start=i,end=j-1;
					maxlen=Math.max(maxlen,Math.abs(end-start)+1);
					i++;
					j--;
					diff=a[j]-a[i];
					if(i>j)	j=i;
				}
				else
				{
					int start=i,end=j-1;
					maxlen=Math.max(maxlen,Math.abs(end-start)+1);
					j++;
					if(j<n)	
						diff=a[j]-a[i];
				}
			}
		}
		System.out.println(maxlen);
	}
}
