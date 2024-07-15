package com.dsa.twopointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TP21 {
	public static void main(String as[])
	{//TP 16
//		GIVEN 2 ARRAYS, FIND MAX NO OF PAIRS THAT CAN BE FORMED WHERE a[i]>b[j]
//		EACH ELEMENT CAN NOT BE IN MORE THAN 1 PAIR!
//		TC NlogN + NlogN + N=> NlogN, SC O(y)/O(n+k)? (complexity increases as internal space needed for sorting)
		int a[]={1,2,3};//1 2 3
		int b[]={1,2,1};//1 1 2 | so 3,1 2,1
		Arrays.sort(a);
		Arrays.sort(b);
		int n=a.length,pairs=0;//both arrays of same length
		int i=0,j=0;
		while(i<n && j<n)
		{
			if(a[i]>b[j])
			{
				pairs++;
				i++;
				j++;
			}
			else
				i++;
		}
//		int pairs=0,i=n-1,j=0; //my way, but it wont guarantee to get max no of pairs
//		while(i>=0 && j<n)
//		{
//			if(a[i]>b[j]) //max of a should be greater than min of b
//			{
//				pairs++;
//				i--;
//				j++;
//			}
//			else
//				i--;
//		}
		System.out.println(pairs);
	}
}
