package com.dsa.twopointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TP26 {
	public static void main(String as[])
	{//TP 20
//		GIVEN 2 ARRAYS OF SIZE N CONTAINING ELEMENTS 1 TO N (strictly increasing). FIND MIN NO OF OPERATIONS NEEDED TO TRANSFORM 2ND ARRAY TO 1ST ARRAY
//		Operation:-> Pick a number from Array B and put it at the start of Array B 
//-> Pick up number from Array B and put it at the end of Array B 
//		TC N, SC N
		int a[]={4,2,3,1,5,6};
		int b[]={3,1,4,6,5,2};
		//op:	 2,3,1,4,6,5
//				 4,2,3,1,6,5
//				 4,2,3,1,5,6
//		3 operations
		//1 2 3 4 5
		//5 3 4 1 2
//		find subarray in array a which is coming as non contiguous elements in array b
		int n=a.length,max=0;
		int i=0,j=0;
		Map<Integer,Integer> map=new HashMap<>();
		while(i<n)
		{
			map.put(b[i],i);
			i++;
		}
		i=0;
		while(i<n)
		{
			int count=0;
			j=i;
			while(j<n-1)
			{
				if(map.get(a[j])<map.get(a[j+1]))
				{
					count++;
				}
				else	
					break;
				j++;
			}
			max=Math.max(max,count+1);
			i+=count+1;
		}
		System.out.println(n-max);
	}
}
