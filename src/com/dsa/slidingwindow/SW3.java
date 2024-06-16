package com.dsa.slidingwindow;

public class SW3 {
	public static void main(String as[])
	{ //SUBARRAYS WITH SUM<=K
		int n=15,k=4; 
		int a[]= {1,2,3,5,8,8,8,8,2,1,1,1,1,1,9};
		int sum=0,count=0;
		for(int i=0,j=0;j<n;j++)
		{
			sum+=a[j];
			while(sum>k)
			{
				sum-=a[i];
				i++;
			}
			count+=j-i+1;
		}
		System.out.println(count);
	}
}
