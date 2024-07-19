package com.dsa.binarysearch;

public class BS6 {
	public static void main(String as[])
	{//BS 6
//		Given a sorted array of 0’s and 1’s find the first occurrence of 1.
//		TC logN,SC 1
		int a[]={0,0,0,0,0,0,0,1,1,1,1};
		int n=a.length,mid,idx=-1;
		int left=0,right=n-1;
		while(left<=right)
		{
			mid=(left+right)/2;
			if(a[mid]==0)
				left=mid+1;
			else
			{
				if(a[mid-1]==1)
					right=mid-1;
				else
				{
					idx=mid;
					break;
				}
			}
		}
        System.out.println(idx);
	}
}