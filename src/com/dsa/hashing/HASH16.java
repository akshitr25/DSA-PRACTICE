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
//		prefSum: 0,5,3,6,7,9
		Map<Integer,Integer> map=new HashMap<>();
		int prefSum[]=new int[n],sum=0,ai,aj,max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
			prefSum[i]=sum;
		}
		System.out.print("ARRAY: \t ");
		for(int i:a)
			System.out.print(i+" ");
		System.out.print("\nPREFSUM: ");
		for(int i:prefSum)
			System.out.print(i+" ");
		System.out.println();
		
		System.out.print("MAX SUM: "+max);
	}
}
