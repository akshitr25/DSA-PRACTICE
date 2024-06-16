package com.dsa.slidingwindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SW9 {
	public static void main(String as[])
	{ //FIND NO OF PAIRS WITH SUM<=K
		int n=10,k=7,count=0,sum=0;  
		int a[]= {3,2,4,5,2,6,12,8,9,10};
		Arrays.sort(a);
		//Map<Integer,Integer> index=new HashMap<>();
		for(int i=0,j=n-1;i<n;i++)
		{
			sum=a[i]+a[j];
			while(sum>k && i!=j)
			{
				j--;
				sum=a[i]+a[j];
			}
			if(i==j)	break;
			count+=j-i;
		}
//		for(int i=0;i<n;i++)
//		{
//			for(int j=n-1;j>=i+1;j--)
//			{
//				sum=a[i]+a[j];
//				if(sum<=k)
//				{
//					count+=j-i;
//					break;
//				}
//			}
//		}
		System.out.println("ARRAY: ");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		System.out.println("\nCount: "+count);
	}
}
