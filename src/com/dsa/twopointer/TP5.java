package com.dsa.twopointer;

import java.util.Arrays;

public class TP5 {
	public static void main(String as[])
	{ //PAIRS WITH SUM<=K
		int n=3,k=2,count=0,i=0,j=0; 
		int a[]= {1,3,2};
		Arrays.sort(a);
		while(j<n) //SAME AS KK's but needed more clarity
		{
			int d=a[j]-a[i];
			while(d>k)
			{
				i++;
				d=a[i]-a[i];
			}
			count+=j-i+1;
			j++;
		}
//		for(int i=0,j=0;j<n;j++) //KK'S better
//		{
//			int d=a[j]-a[i];
//			while(d>k)
//			{
//				i++;
//				d=a[j]-a[i];
//			}
//			count+=j-i+1;
//		}
		System.out.println(count);
	}
}
