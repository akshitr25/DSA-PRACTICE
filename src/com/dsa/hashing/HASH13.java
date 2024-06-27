package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH13 {
	public static void main(String as[])
	{// hash 17
		//FIND COUNT OF SUBARRAY HAVING LONGEST LENGTH WHOSE SUM==K
		int a[]= {10,5,2,7,1,9,8,7},n=a.length;
		int k=15,count=0;
		Map<Integer,Integer> map=new HashMap<>(); //sum,index
		//FIRST FIND SUBARRAY OF SMALLEST LENGTH USING HASHMAP
		//THEN MAKE SLIDING WINDOW AND CHECK IF SUM==K
		int max=Integer.MIN_VALUE;
		int sum=0;
//		fixed sw template
		//int i=0,j=0;
		map.put(0,-1);
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
			if(map.containsKey(sum-k))
				max=Math.max(max,i-map.get(sum-k));
			map.put(sum,i);
		}
		if(max!=Integer.MIN_VALUE)
		{
			int k1=max;
			int i=0,j=0;
			sum=0;
			while(j<n)
			{
				sum+=a[j];
				if(j-i+1<k1)	j++;
				else if(j-i+1==k1)
				{
					if(sum==k)	count++;
					sum-=a[i]; //unaffect the sum/REMOVAL
					i++;
					j++;
				}
			}
		}
		System.out.print(count);
	}
}
