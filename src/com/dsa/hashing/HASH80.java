package com.dsa.hashing;

public class HASH80 {
	public static void main(String as[])
	{// hash 59
//		Given an array of zeros and ones ; find the number of subarrays which have this property :->
//	(no of zeroes)/(no of ones)= x/y
//		BF TC N^2, SC 1
//		zeroes/ones=x/y
//		zeroes*y=ones*x
		int a[]= {1,0,1,1,1,1,1},n=a.length,ans=0,x=1,y=2;
		for(int i=0;i<n;i++)
		{
			int ones=0,zeroes=0;
			for(int j=i;j<n;j++)
			{
				if(a[j]==1)
					ones++;
				else
					zeroes++;
				if(zeroes*y==ones*x)
					ans++;
			}
		}
		System.out.println(ans);
	}
}