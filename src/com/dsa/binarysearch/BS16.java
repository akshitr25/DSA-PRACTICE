package com.dsa.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BS16 {
	public static void main(String as[])
	{//BS 15
//		Given two unsorted arrays arr1[] and arr2[]. They may contain duplicates. For each element in arr1[] count elements less than or equal to it in array arr2[].
//		TC N*logN, SC N
		int a[]={1,2,3,4,7,9};
		int b[]={0,1,2,1,1,4};
		int n=a.length;
		Arrays.sort(b);
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		for(int i:b)
			System.out.print(i+" ");
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			int count=0;
			int target=a[i];
			int left=0,right=a.length-1;
			while(left<=right)
			{
				int mid=(left+right)/2;
				if(b[mid]<=target)
				{
					count+=mid-left+1;
					left=mid+1;
				}
				else if(b[mid]>target)
				{
					right=mid-1;
				}
			}
			ans.add(count);
		}
		System.out.println();
		System.out.print(ans);
    }
}