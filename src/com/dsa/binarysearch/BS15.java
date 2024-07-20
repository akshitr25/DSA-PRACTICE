package com.dsa.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BS15 {
	public static void main(String as[])
	{//BS 14
//		Find the middle occurrence of X in the given array
//		A = [1,2,2,2,2,3,4,5,6,7] , X= 2
//				Output : 2
//		TC logN, SC 1 
		int a[]={1,2,2,2,2,3,4,5,6,7},x=2,n=a.length;
		int left=0,right=n-1;
		int ansleft=-1,ansright=-1;
		while(left<=right) //get left index
		{
			int mid=(left+right)/2;
			if(a[mid]==x)
			{
				ansleft=mid;
				right=mid-1;
			}
			else if(a[mid]>x)
			{
				right=mid-1;
			}
			else if(a[mid]<x)
			{
				left=mid+1;
			}
		}
		left=0;
		right=n-1;
		while(left<=right) //get right index
		{
			int mid=(left+right)/2;
			if(a[mid]==x)
			{
				ansright=mid;
				left=mid+1;
			}
			else if(a[mid]>x)
			{
				right=mid-1;
			}
			else if(a[mid]<x)
			{
				left=mid+1;
			}
		}
		System.out.println(ansleft+" "+ansright);
		System.out.println((ansleft+ansright)/2);
    }
}