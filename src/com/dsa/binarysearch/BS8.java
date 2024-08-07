package com.dsa.binarysearch;

public class BS8 {
	public static void main(String as[])
	{//BS 8
//		You are given an array of size “N” ; you are given a capacity of “k” ; 
//		Each element can be reduced by at most k in 1 move. You are allowed to make maximum “d” moves. Find the minimum possible value of “k” 
//		BF TC N*limit, SC 1
		int a[]={2,4,3},k=3,d=4;
//		int a[]={2,3,4,5},k=1,d=5;
		int n=a.length,ans=0;
		int limit=-1;
		for(int i:a)
			limit=Math.max(i,limit);
		while(k<=limit)
		{
			if(check(k,a,d)==false)
				k++;
			else
			{
				ans=k;
				break;
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