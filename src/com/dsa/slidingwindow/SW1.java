package com.dsa.slidingwindow;

public class SW1 {
		//GIVEN AN ARRAY, FIND MAX SUM OF K CONSECUTIVE ELEMENTS
	public static void main(String as[])
	{
		int n=4,k=2; 
		int a[]= {100,200,300,400};
		int sum=0,count=0;
		int i=0,j=0,maxsum=0;
		while(j<n)
		{
			sum+=a[j];
			
			if(j-i+1<k)
				j++;
			else if(j-i+1==k)
			{
				maxsum=Math.max(maxsum,sum);
				sum-=a[i];
				i++;
				j++;
			}
		}
		System.out.println("MAXSUM: "+maxsum);
	}
}
