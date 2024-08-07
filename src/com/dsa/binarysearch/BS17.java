package com.dsa.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BS17 {
	public static void main(String as[])
	{//BS 17
//		You are given an array consisting of n integers which denote the position of a stall. 
//		You are also given an integer k which denotes the number of aggressive cows. 
//		You are given the task of assigning stalls to k cows such that the minimum distance between any two of them is the maximum possible.
		int a[]={0,4,3,7,10,9},k=6,n=a.length;
		Arrays.sort(a);
		int l=0,r=n-1,ans=r;
		while(l<=r)
		{
			int mid=(l+r)/2;
			if(minDistGteMid(mid,k,a))
			{
				ans=mid;
				l=mid+1;
			}
			else
				r=mid-1;
		}
		System.out.println(ans);
    }
	static boolean minDistGteMid(int mid,int k,int[] a)
	{
		int last=a[0];
		k--;
		for(int i=0;i<a.length;i++)
		{
			int curr=a[i];
			if(curr-last>=mid)
			{
				k--;
				last=curr;
			}
			if(k==0)	return true;
		}
		return false;
	}
}