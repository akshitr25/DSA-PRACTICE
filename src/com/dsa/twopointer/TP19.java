package com.dsa.twopointer;

import java.util.HashMap;
import java.util.Map;

public class TP19 {
	public static void main(String as[])
	{//TP 15
//		P0-> Given an array of numbers ; find the longest subarray which has number g coming for <=k times. (-->k or k-1 or k-2 or k-3 or….1 or 0) 
//		TC N, SC N 
		int a[]={1,2,3,4,3,5,5,5},g=3,k=1;
//		int a[]={5,5,6,7,8,8,6,5,5},g=5,k=2; //count=7
		int n=a.length,maxlen=0;
		int i=0,j=0,count=0;
		Map<Integer,Integer> map=new HashMap<>();
		while(i<n && j<n)
		{
			if(i==j)
			{
				count=0;
				if(a[i]==g)
					count++;
				if(count>k)
				{
					i++;
					j++;
				}
				else
				{
					maxlen=Math.max(maxlen,1); //as i=j so len will be 1, comapre it to maxlen.
					j++;
					if(j<n)
					{
						if(a[j]==g)
							count++;
					}
				}
			}
			else //if(count>k
			{
				if(count>k)
				{
					if(a[i]==g)
						count--;
					i++;
					if(a[j]==g)
						count--;
					j--;
					if(i>j)
						j=i;
				}
				else
				{
					maxlen=Math.max(maxlen,j-i+1);
					j++;
					if(j<n)
					{
						if(a[j]==g)
							count++;
					}
				}
			}
		}
		System.out.println(maxlen);
	}
}
