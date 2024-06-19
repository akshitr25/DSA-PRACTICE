package com.dsa.slidingwindow;

public class SW12 {
	public static void main(String as[])
	{
//		MOVE ALL ZEROES TO END OF ARRAY
//		OPTIMAL TC:O(N), SC:O(1)
		int a[]= {0,0,11,0,0,1,2,0,4,0,7,2,0,0,0,0};//{3,5,0,0,4};
		int i=0,j=0,n=a.length;
		while(i<n && j<n)
		{
			if(a[i]==0) //find element which is 0
			{
				if(a[j]!=0) //find non 0 element which is just after our 0 ele.
				{
					int temp=a[j]; //swap
					a[j]=a[i];
					a[i]=temp;
				}
				else	j++; //move fwd
			}
			else //move fwd
			{
				i++;
				j++;
			}
		}
		for(int x:a)
			System.out.println(x+" ");
	}
//	public static int[] moveZeroes(int a[])
//	{
//		int start=0,end=0,n=a.length;
//		while
//		return a;
//	}
}