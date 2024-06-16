package com.dsa.hashing;

public class HASH5 {
	public static void main(String as[])
	{
		int a[] = new int[]{1, 4, 5, 7};
		int b[] = new int[]{10, 20, 30, 40};
		int x=31;
		int n=a.length;
		int first=0,second=0;
		int maxsum=0,i=1,j=n-1;
		while(i<n && j>=1)
		{
			if(a[i]+b[j]<=x)
			{
				int sum=a[i]+b[j];
				if(sum>maxsum)
				{
					maxsum=sum;
					first=a[i];
					second=b[j];
				}
				i++;
			}
			else
			{
				j--;
			}
		}
		System.out.println("SUM: "+maxsum+"\n"+first+"+"+second);
	}
}
