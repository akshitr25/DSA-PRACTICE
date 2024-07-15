package com.dsa.twopointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TP24 {
	public static void main(String as[])
	{//TP 19
//		You are given an array of size “N”.
//		For each and every subarray -> find the count of distinct elements in it -> put all those counts in new array -> sort it -> find the middle element.
//		Optimal TC , SC 
		int a[]={1,5,2,1,3,5},n=a.length;
		List<Integer> list=new ArrayList<>();
		//c1=no of subarrays such that <=1 distinct element
		//c2........cn
		//cn can only be 0 or 1.
		int count[]=new int[n];
		for(int i=0;i<n;i++)
		{
			count[i]=count(i,a);
		}
		int total=n*(n+1)/2,mid;
		int ans=0;
		for(int i=0;i<n;i++)
		{
			if(total%2==0)
				mid=total/2;
			else
				mid=total/2+1;
			if(count[i]<mid && count[i+1]>=mid)
			{
				ans=i+1;
			}
		}
		System.out.println(ans);
	}
	static int count(int k,int a[])
	{
		int i=0,j=0,n=a.length,sum=0;
		Map<Integer,Integer> map=new HashMap<>();
		map.put(0,1);
		while(j<n)
		{
			if(map.size()<=k)
			{
				sum+=j-i+1;
				j++;
				map.put(a[j],map.getOrDefault(a[j],0)+1);
			}
			else
			{
				map.put(a[i],map.getOrDefault(a[i],0)-1);
				if(map.containsKey(a[i]))
				{
					if(map.get(a[i])==0)
						map.remove(a[i]);
				}
				i++;
			}
		}
		return sum;
	}
}
