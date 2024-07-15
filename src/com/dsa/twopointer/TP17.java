package com.dsa.twopointer;

import java.util.HashMap;
import java.util.Map;

public class TP17 {
	public static void main(String as[])
	{//TP 14
//		Given an array A[] of N integers and a range(L, R). The task is to find the number of subarrays having sum in the range L to R (inclusive).
//		TC N, SC 1 
		int a[]={2,3,5,8},l=4,r=13; //ans=6
		//1,4,6 | 3,8 | ans=3
		int n=a.length;
		int count1=count(n,a,l-1);
		int count2=count(n,a,r);
		System.out.println(count2-count1);
	}
	static int count(int n, int a[],int x)
	{
		int sum=0,count=0;
		for(int left=0,right=0;right<n;right++)
		{
			sum+=a[right];
			while(sum>x)
			{
				sum-=a[left];
				left++;
			}
			count+=right-left+1;
		}
		return count;
	}
}
