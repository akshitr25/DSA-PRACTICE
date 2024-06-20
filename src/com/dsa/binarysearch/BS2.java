package com.dsa.binarysearch;

public class BS2 {
	public static void main(String as[])
	{
		//FIND INDEX OF NUM IN ARRAY WHICH IS JUST GREATER THAN GIVEN NUMBER X AND AS CLOSE AS POSSIBLE TO X.
		//TC: O(logN) SC: O(1)
		int a[]= {1,3,5,6,6,7,7,9},target=6;
		int n=a.length-1;
        int ans=closest(a,target);
        System.out.print("INDEX: "+ans+", VALUE: "+a[ans]);
	}
	public static int closest(int[] a,int target)
    {
        int l=0,r=a.length-1;
        int ans=-1;
        while(l<=r)
        {
        	int mid=(l+r)/2;//l+(r-l)/2
        	if(a[mid]<=target)
        	{
        		l=mid+1;
        	}
        	else if(a[mid]>target)
        	{
        		ans=mid;
        		r=mid-1;
        	}
        }
        return l;
    }
}
