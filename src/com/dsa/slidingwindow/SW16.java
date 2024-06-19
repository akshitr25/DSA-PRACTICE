package com.dsa.slidingwindow;

public class SW16 {
	public static void main(String as[])
	{
//		FIND NO OF K SIZE SUBARRAYS WHERE VALUE IS STRICTLY INCREASING
//		OPTIMAL TC:O(N), SC:O(1)
		int a[]= {5,3,5,7,8},k=3,n=a.length;
		int i=0,prevSize=0,count=0,sum=0;
		while(i<n)
		{
			if(i>=1 && a[i]>a[i-1])
				prevSize++;
			else
			{
				int currSize=prevSize+1;
				int q=k;
				if(currSize>=q && q>=1)
					count+=Math.abs(currSize-q)+1;
				prevSize=0;
			}
			i++;
		}
		int currSize=prevSize+1;
		int q=k;
		if(currSize>=q)
			count+=Math.abs(currSize-q)+1;
		if(k==1)	count=n;
		System.out.println(count);
	}
}