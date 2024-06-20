package com.dsa.binarysearch;

public class BS1 {
	public static void main(String as[])
	{
		//FIND FIRST AND LAST POSITION INDEX OF AN ELEMENT (TARGET) IN A SORTED ARRAY.
		//TC: O(logN) SC: O(1)
		int a[]= {5,7,7,8,8,10},target=8;
		int n=a.length-1;
        int left=first(a,target);
        int right=last(a,target);
        int ans[]= {left,right};
        for(int i:ans)	System.out.print(i+" ");
	}
	public static int first(int[] a,int target)
    {
        int l=0,r=a.length-1;
        int ans=-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(a[mid]==target)
            {
                ans=mid;
                r=mid-1;
            }
            else if(a[mid]<target)
            {
                l=mid+1;
            }
            else if(a[mid]>target)
            {
                r=mid-1;
            }
        }
        return ans;
    }
    public static int last(int[] a,int target)
    {
        int l=0,r=a.length-1,ans=-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(a[mid]==target)
            {
                ans=mid;
                l=mid+1;
            }
            else if(a[mid]>target)
            {
                r=mid-1;
            }
            else if(a[mid]<target)
            {
                l=mid+1;
            }
        }
        return ans;
    }
}
