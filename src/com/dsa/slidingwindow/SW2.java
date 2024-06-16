package com.dsa.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class SW2 {
	public static void main(String as[])
	{
		int a[] = new int[]{-10,-4,1,2,10};
		int ans[]=new int[a.length];
		int idx=0;
		int p=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				p=i-1;
				break;
			}
		}
		int i=p,j=p+1; //i is idx of last -ve no, and j is idx of first non -ve no
		while(i>=0 && j<a.length)
		{
			int A=a[i]*a[i];
			int B=a[j]*a[j];
			if(A<B)
			{
				ans[idx]=A;
				i--;
			}
			else
			{
				ans[idx]=B;
				j++;
			}
			idx++;
		}
		while(i>=0)
		{
			int val=a[i--];
			ans[idx]=val*val;
			idx++;
		}
		while(j<a.length)
		{
			int val=a[j++];
			ans[idx]=val*val;
			idx++;
		}
		for(int x:ans)
			System.out.print(x+" ");
	}
}

