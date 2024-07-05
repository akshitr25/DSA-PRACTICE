package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HASH60 {
	public static void main(String as[])
	{// hash 42!
//		Find the number of subarrays such that their maximum is K
//		Optimal TC N^2, SC 1
//		HOW TO DO WITH STACK?
		int a[]={8,2,1,3,4,5,1,10},k=3,n=a.length,count=0;
//		8,2,1,3,4,5,1,10 | 3
//		15,0,5,1,5,2,3,15 | 5
//		COMBINATOR FORMULA : (x+1)*(y+1)
//							=>x*y+x+y+1;
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				int x=0,y=0,j=i-1;
				while(j>=0) //go left
				{
					if(a[i]>=a[j])
					{
						x++;
						j--;
					}
					else	break; //a[i]<a[j} || a[i]==a[j]
				}
				j=i+1;
				while(j<n) //go right
				{
					if(a[i]>a[j])
					{
						y++;
						j++;
					}
					else	break;
				}
				count=count+(x+1)*(y+1);
			}
		}
		System.out.println(count);
	}
}
