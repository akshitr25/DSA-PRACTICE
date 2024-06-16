package com.dsa.twopointer;

import java.util.HashMap;
import java.util.Map;

public class TP4 {
	public static void main(String as[])
	{ //SUBARRAYS WITH DISTINCT NO. COUNT<=K
		int n=15,k=4; 
		int a[]= {1,2,3,5,8,8,8,8,2,1,1,1,1,1,1};
		int count=0;
		for(int i=0;i<n;i++)
		{
			Map<Integer,Integer> map=new HashMap<>();
			for(int j=i;j<n;j++)
			{
				map.put(a[j],map.getOrDefault(a[j],0)+1);
				int d=map.size();
				if(d<=k)
					count++;
			}
		}
		System.out.println(count);
	}
}
