package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HASH58 {
	public static void main(String as[])
	{// hash 41!
//		GIVEN AN ARRAY, DIVIDE INTO 4 NON OVERLAPPING SUBARRAYS (CAN BE EMPTY) SUCH THAT DIFFERENCE BW SUMS OF 1ST AND 3RD SUBARRAY AND SUM OF 2ND AND 4TH SUBARRAY IS MAX.
//		ans=Math.abs((s1+s3)-(s2+s4))
//		approach:
//		MAKE S1 S3 MAX AND S2 S4 MIN
//		find 2 non intersecting subarrays whose sum is as min as possible. then, p1 and p3 are already fixed.
//		TC N, SC N 
		int a[]={-4,1,-1},n=a.length,sum=0,totalsum=0,min=Integer.MAX_VALUE;
//		-3,4,-5,2,6,-5
		for(int i:a)
			totalsum+=i;
		int p2[]=new int[n+1];
		int i=1;
		p2[0]=a[0];
		while(i<n)
		{
			p2[i]=Math.min(a[i],p2[i-1]+a[i]); //min possible subarray ending at index i
			i++;
		}
		int p4[]=new int[n+1]; //last subarray with min sum
		i=n-1;
		while(i>=0)
		{
			sum+=a[i];
			p4[i]=Math.min(p4[i+1],sum); //min sum subarray starting from i and ending at n-1
			i--;
		}
		
		for(i=0;i<n;i++)
		{
			int val=Math.min(p2[i],0)+Math.min(p4[i+1],0);
			min=Math.min(min,val);
		}
		System.out.println(totalsum-min-min);
	}
}
