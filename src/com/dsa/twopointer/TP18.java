package com.dsa.twopointer;

import java.util.HashMap;
import java.util.Map;

public class TP18 {
	public static void main(String as[])
	{//TP 15
//		Count pairs in a sorted array whose sum is less than x
//		TC N, SC 1 
		int a[]={1,2,3,4,5,6,7,8},x=7;
		//int a[]={1,3,7,9,10,11},x=7; //pairs=1
		int n=a.length;
		int left=0,right=n-1,sum=0,pairs=0;
		while(left<right)
		{
			sum=a[left]+a[right];
			if(sum<x)
			{
				pairs+=right-left;
				left++;
			}
			else
			{
				right--;
			}
		}
		System.out.println(pairs);
	}
}
