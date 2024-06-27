package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH14 {
	public static void main(String as[])
	{// hash 18
//		GIVEN AN ARRAY, FIND NO OF SPECIAL PAIRS IN ARRAY.
//		Cond: i<j and A[A[A[i]]]=A[A[A[j]]]
		int a[]={0,4,2,1,2},n=a.length,count=0;;
		//BF, TC N^2, SC 1
		//generate all pairs with n^2, and check for A[A[A[i]]]=A[A[A[j]]]
		for(int i=1;i<=n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				if(a[a[a[i]]]==a[a[a[j]]])	count++;
			}
		}
		System.out.print(count);
	}
}
