package com.dsa.binarysearch;

public class BS4 {
	public static void main(String as[])
	{
		// FIND THE ELEMENT OCCURING ONCE IN A SORTED ARRAY HAVING REST ALL ELEMENTS WITH FREQUENCIES=2
		//TC: O(logN) SC: O(1)
		int a[]= {1,1,2,3,3,4,4,8,8};
		int n=a.length-1;
        int ans=search(a);
        System.out.print(ans);
	}
	public static int search(int[] a)
    {
		int n=a.length,l=0,r=a.length-1;
        if(n==1)    return a[0];
        while(l<r)
        {
        	int mid=(l+r)/2;
        	if((mid%2==1 && a[mid]==a[mid-1]) || (mid%2==0 && a[mid]==a[mid+1]))    l=mid+1;
            else    r=mid;
        }
        return a[l];
    }
}