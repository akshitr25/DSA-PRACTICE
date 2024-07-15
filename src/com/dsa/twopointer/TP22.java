package com.dsa.twopointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TP22 {
	public static void main(String as[])
	{//TP 18
		int a[]={0,1,0,3,12},n=a.length;
		int i=0,j=0;
		//TC N, SC 1
		//i is first position with 0, j is first position with non 0.
		while(j<n)
		{
			if(a[j]!=0)
			{
				a[i]=a[j];
				a[j]=0;
				i++;
			}
			j++;
		}
		while(i<n)
		{
			a[i]=0;
			i++;
		}
		for(int x:a)
			System.out.print(x+" ");
	}
}
