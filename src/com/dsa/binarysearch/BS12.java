package com.dsa.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BS12 {
	public static void main(String as[])
	{//BS 11
//		Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//		You must write an algorithm with O(log n) runtime complexity.
		int a[]={1,2,3,5,6,7,8,9,10},k=4;
		System.out.println(searchInsert(a,k));
    }
	static int searchInsert(int[] a, int k) {
        int n=a.length,left=0,right=n-1,mid=-1;
        if(k>a[right])  return n;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(a[mid]==k)
            {
                return mid;
            }
            else if(a[mid]>k)
            {
                if(mid>0 && a[mid-1]<k)
                {
                    return mid;
                }
                else 
                    right=mid-1;
            }
            else if(a[mid]<k)
            {
                left=mid+1;
            }
        }
        return mid;
    }
}