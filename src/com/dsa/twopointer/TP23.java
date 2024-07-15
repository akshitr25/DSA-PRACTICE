package com.dsa.twopointer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TP23 {
	public static void main(String as[])
	{//TP 19
//		You are given an array of size “N”.
//		For each and every subarray -> find the count of distinct elements in it -> put all those counts in new array -> sort it -> find the middle element.
//		BF TC N^2, SC N
		int a[]={1,5,2,1,3,5},n=a.length;
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			Map<Integer,Integer> map=new HashMap<>(); //element, freq. size of map means how many distinct nos in subarray.
			int j=i;
			for(j=i;j<n;j++)
			{
				map.put(a[j],map.getOrDefault(a[j],0)+1);
				list.add(map.size());
			}
		}
		System.out.println(list);
		System.out.println(list.get(list.size()/2));
	}
}
