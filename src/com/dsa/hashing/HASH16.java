package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH16 {
	public static void main(String as[])
	{// hash 19
//		You are given an integer array A of size N. 
//Your task is to select exactly B elements from either the left end or the right end of the array A in order to maximize the sum of the selected elements.
//		B can be from 1 to N.
//		NEED TO PICK OVERALL B ELEMENTS FROM BOTH ENDS
//		MY EXAMPLE: -1,5,-2,8,-78,2,-100
		int a[]={5,-2,3,1,2},n=a.length,b=3; //1 based indexing
//		SUFFSUM: 9 4 6 3 2 
		Map<Integer,Integer> map=new HashMap<>();
		int suffsum[]=new int[n+1],sum=0,ai,aj,max=Integer.MIN_VALUE;
		sum=0;
		suffsum[n]=0;
		suffsum[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--)
		{
			suffsum[i]=a[i]+suffsum[i+1];
		}
		System.out.print("ARRAY: \t ");
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		System.out.print("SUFFSUM: ");
		for(int i:suffsum)
			System.out.print(i+" ");
		//suffix sum array only
		int prefsum=0;
		int ans=suffsum[n-b];
		for(int i=0;i<b;i++) /*****/
		{
			prefsum+=a[i];
			int suff=suffsum[n-b+(i+1)];
			ans=Math.max(ans,prefsum+suff);
		}
		System.out.print("\nMAX SUM: "+ans);
	}
}
