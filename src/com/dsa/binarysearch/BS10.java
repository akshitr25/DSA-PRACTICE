package com.dsa.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BS10 {
	public static void main(String as[])
	{//BS 9
//		Median in a row-wise sorted Matrix
//		Given a row wise sorted matrix of size R*C where R and C are always odd, find the median of the matrix.
//		TC log2(1e9) * N * log2(M), SC 1
		int a[][]={
				{2,4,8,10,20},
				{2,10,12,12,20},
				{4,15,18,18,20}
			};
		int n=a.length,m=a[0].length;
		int l=0,r=Integer.MAX_VALUE;
		int total=m*n,median=0;
		while(l<=r)
		{
			int mid=(l+r)/2;
			int lte=0;
			for(int row=0;row<n;row++)
			{
				lte+=upperBound(a,row,mid);
			}
			if(lte>total/2)
			{
				median=mid;
				r=mid-1;
			}
			else
				l=mid+1;
		}
		System.out.println(median);
	}
	static int upperBound(int a[][],int r, int target)
	{
		int idx=-1,low=0,high=a[r].length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[r][mid]<=target)
			{
				idx=mid;
				low=mid+1;
			}
			else
				high=mid-1;
		}
		int lte=idx+1;
		return lte;
	}
}