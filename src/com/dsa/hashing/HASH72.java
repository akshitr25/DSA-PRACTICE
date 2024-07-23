package com.dsa.hashing;

public class HASH72 {
	public static void main(String as[])
	{// hash 53!
//		GIVEN AN ARRAY, FIND NO OF TUPLES (i,j,k,l,m) such a[i]<a[j]>a[k]<a[l]>a[m] 
//		BF TC N^5, SC 1 
		int a[]={1,2,1,2,1,0},n=a.length,count=0;
//		1 2 1 2 1 | 1 2 1 2 0
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					for(int l=k+1;l<n;l++)
					{
						for(int m=l+1;m<n;m++)
						{
							if((a[i]<a[j]) && (a[j]>a[k]) && (a[k]<a[l]) && (a[l]>a[m]))
								count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}