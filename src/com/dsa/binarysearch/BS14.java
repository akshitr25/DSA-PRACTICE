package com.dsa.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BS14 {
	public static void main(String as[])
	{//BS 13
//		You are given an m x n integer matrix matrix with the following two properties:
//		Each row is sorted in non-decreasing order.
//		The first integer of each row is greater than the last integer of the previous row.
//		Given an integer target, return true if target is in matrix or false otherwise.
		int a[][]={{1,3,5,7},{10,11,16,20}},k=3;
		int n=a.length;
        int m=a[0].length;
        int left=0,right=n*m-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            int row=mid/m;
            int col=mid%m;
            if(a[row][col]==k)
            {
            	System.out.println(true);
            	return;
            }
            else if(a[row][col]<k)
                left=mid+1;
            else
                right=mid-1;
        }
        System.out.println(false);
    }
}