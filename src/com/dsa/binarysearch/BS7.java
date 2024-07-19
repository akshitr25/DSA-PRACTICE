package com.dsa.binarysearch;

public class BS7 {
	public static void main(String as[])
	{//BS 7
//		Given an array of size “N”; b[i] tells you the numbers of bananas in box “i” ; you have to select k which is your eating power 
//And you have to select k in such a manner that you are able to eat all bananas in <=h hours; 
//In 1 hour you can only eat k bananas! 
//		TC NlogN, SC 1 
		int a[]={3,6,7,11},h=8;
		int k=0,n=a.length;
		int tr=0;
		for(int i=0;i<n;i++)
		{
			tr=Math.max(tr,a[i]);
		}
		int low=0,high=tr;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(check(mid,a,h)==false)
			{
				low=mid+1;
			}
			else
			{
				if(mid==1)
				{
					k=1;
					break;
				}
				else if(check(mid-1,a,h)==false)
				{
					k=mid;
					break;
				}
				else
					high=mid-1;
			}
		}
        System.out.println(k);
	}
	static boolean check(int k,int a[],int h)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%k==0)
				sum+=(a[i]/k);
			else
				sum+=(a[i]/k)+1;
		}
		return sum<=h;
	}
}