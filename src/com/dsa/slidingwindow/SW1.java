package com.dsa.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class SW1 {
	public static void main(String as[])
	{
		int a[] = new int[]{1, 4, 5, 7};
		int b[] = new int[]{10, 20, 30, 40};
		int x=31;
		int n=a.length;
		int first=0,second=0;
		int maxsum=0,i=1,j=n-1;
		int flag1=0,flag2=0,greaterSum=Integer.MAX_VALUE,greaterFirst=0,greaterSecond=0;
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
					flag1=1;
				}
				i++;
			}
			else
			{
				if(a[i]+b[j]<greaterSum)
				{
					greaterSum=a[i]+b[j];
					greaterFirst=a[i];
					greaterSecond=b[j];
				}
				j--;
			}
		}
		List<Integer> ans=new ArrayList<>();
		if(flag1==1)
		{
			int diff1=Math.abs(x-maxsum);
			if(flag2==1)
			{
				int diff2=Math.abs(x-greaterSum);
				if(diff1>diff2)
				{
					ans.add(first);
					ans.add(second);
				}
				else
				{
					ans.add(greaterFirst);
					ans.add(greaterSecond);
				}
			}
			else
			{
				ans.add(first);
				ans.add(second);
			}
		}
		System.out.println("SUM: "+maxsum+"\n"+ans.get(0)+"+"+ans.get(1));
	}
}
