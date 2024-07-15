package com.dsa.twopointer;

import java.util.HashMap;
import java.util.Map;

public class TP14 {
	public static void main(String as[])
	{//TP 11
//		Longest subarray having sum of elements atmost K
//		TC N, SC 1 
		int a[]={8,2,4,0,1,1,0},k=9;
		//1,2,1,0,1,1,0 | 4 | ans=5
		int n=a.length,maxlen=-1,i=0,j=0,sum=0;
		while(j<n)
		{
			sum+=a[j];
			if(sum<=k)
			{
				maxlen=Math.max(maxlen,j-i+1);
			}
			else //if(sum>k) STOP
			{
				sum-=a[i];
				i++;
			}
			j++;
		}
		System.out.println(maxlen);
	}
}
