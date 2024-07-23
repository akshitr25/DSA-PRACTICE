package com.dsa.hashing;

public class HASH73 {
	public static void main(String as[])
	{// hash 52!
//		GIVEN AN ARRAY, FIND NO OF TUPLES (i,j,k,l,m) such a[i]<a[j] >a[k]< a[l]>a[m] 
//		OPTIMAL TC 3*(N^2), SC 2*(N)  
		int a[]={1,2,1,2,1,0},n=a.length,ans=0;
//		1 2 1 2 1 | 1 2 1 2 0
//		count no of a[i]<a[j]
//		p[j]=no of such pairs
		int p[]=new int[n];
//		for a[i]<a[j]
		for(int j=0;j<n;j++)
		{
			for(int i=j-1;i>=0;i--)
			{
				if(a[i]<a[j])
				{
					p[j]++;
				}
			}
		}
//		for a[l]>a[m]
//		count no of a[l]>a[m]
//		s[l]=no of such pairs
		int s[]=new int[n];
		for(int l=n-1;l>=0;l--)
		{
			for(int m=l+1;m<n;m++)
			{
				if(a[l]>a[m])
					s[l]++;
			}
		}
//		.........a[k].........
//		x*y
		for(int k=0;k<n;k++)
		{
			int left=0;
			for(int j=0;j<k;j++)
			{
				if(a[j]>a[k])
					left+=p[j];
			}
			int right=0;
			for(int l=k+1;l<n;l++)
			{
				if(a[l]>a[k])
					right+=s[l];
			}
			ans+=left*right;
		}
		System.out.println(ans);
	}
}