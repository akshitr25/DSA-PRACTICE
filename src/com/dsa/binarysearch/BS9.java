package com.dsa.binarysearch;

public class BS9 {
	public static void main(String as[])
	{//BS 8
//		You are given an array of size “N” ; you are given a capacity of “k” ; 
//		Each element can be reduced by at most k in 1 move. You are allowed to make maximum “d” moves. Find the minimum possible value of “k” 
//		BF TC N*log(limit), SC 1
		int a[]={2,4,3},k=3,d=4;
//		int a[]={2,3,4,5},k=1,d=5;
		int n=a.length,ans=0;
		int limit=-1;
		for(int i:a)
			limit=Math.max(i,limit);
		int low=1,high=limit;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(check(mid,a,d)==false)
			{
				low=mid+1;
			}
			else
			{
				if(mid==1)
				{
					ans=mid;
					break;
				}
				else if(check(mid-1,a,d)==false)
				{
					ans=mid;
					break;
				}
				else
					high=mid-1;
			}
				
		}
		System.out.println(ans);
	}
	static boolean check(int k,int a[],int d)
	{
		int n=a.length,moves=0;
		for(int i=0;i<n;i++)
		{
			if(k!=0 && a[i]%k==0)
				moves+=a[i]/k;
			else
				moves+=a[i]/k+1;
		}
		return moves<=d;
	}
}