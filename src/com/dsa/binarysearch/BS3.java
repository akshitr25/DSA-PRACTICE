package com.dsa.binarysearch;

public class BS3 {
	public static void main(String as[])
	{
		// Search in Rotated Sorted Array
		//TC: O(logN) SC: O(1)
		int a[]= {4,5,6,7, 0,1,2},target=3;
		int n=a.length-1;
        int ans=search(a,target);
        System.out.print(ans);
	}
	public static int search(int[] a,int target)
    {
        int n=a.length,l=0,r=a.length-1,ans=-1;
        while(l<=r)
        {
        	int mid=(l+r)/2;
        	if(a[mid]==target)	return mid;
        	if(a[mid]>=a[0])
        	{
        		if(target>a[mid] || target<a[0])	l=mid+1;
        		else	r=mid-1;
        	}
        	else
        	{
        		if(target<a[mid] || target>a[n-1])	r=mid-1;
        		else	l=mid+1;
        	}
        }
        return ans;
    }
}