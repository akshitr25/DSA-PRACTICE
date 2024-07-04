package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HASH53 {
	public static void main(String as[])
	{// hash 38!
//		Given an array of size “N” ; find the maximum sum subarray which has the same elements in the start and end. 
//		BF TC N^2, SC 1
		int a[]={1,8,10,8,-5,8},n=a.length,sum=0,max=-1; //maxsum should be 29
//		15,-10,15,100,15,-1000,15
		for(int i=0;i<n;i++)
		{
			sum=0;
			for(int j=i;j<n;j++)
			{
				sum+=a[j];
				if(a[i]==a[j])
					max=Math.max(max,sum);
			}
		}
		System.out.println(max);
	}
}
