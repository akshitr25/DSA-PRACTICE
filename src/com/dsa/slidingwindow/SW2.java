package com.dsa.slidingwindow;

public class SW2 {
	public static void main(String as[])
	{
		//RETURN MIN MEMORY AFTER REMOVING MAXSUM OF K CONTIGUOUS ELEMENTS TC: O(N), SC:O(1)
		int i=0,total=0;
		int p[]= {10,4,8,13,20};
		for(int x:p)	total+=x;
		int k=2,n=5,sum=0,max=Integer.MIN_VALUE;
		for(int j=0;j<n;j++)
		{
			sum+=p[j];
			max=Math.max(max,sum);
			if(j-i+1>=k)
			{
				if(j-i+1==k)	Math.max(max,sum);
				sum-=p[i];
				i++;
			}
		}
		System.out.println("TOTAL MEMORY: "+total+"\n"+"MIN MEMORY: "+(total-max));
	}
}
