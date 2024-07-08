package com.dsa.twopointer;

public class TP11 {
	public static void main(String as[])
	{ //Given two array A and B :- Find the number of good indices in array B 
//		Good Index meaning - When you remove this index :- array B becomes a subsequence of array A
 
		int a[]={1,2,5,8,8,6,5,4,3},b[]={5,5},na=a.length,nb=b.length;
		int i=0,j=0;
		while(i<na && j<nb)
		{
			if(a[i]==b[j])
			{
				i++;
				j++;
			}
			else
			{
				i++;
			}
		}
		if(j==nb)
			System.out.println(true);
		else	System.out.println(false);
	}
}
