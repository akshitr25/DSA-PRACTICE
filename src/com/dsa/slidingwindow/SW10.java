package com.dsa.slidingwindow;

public class SW10 {
	public static void main(String as[])
	{
//		COUNT NO OF SUBARRAYS W SUM==K
//		OPTIMAL TC:O(), SC:O()
		int a[]= {1,11,2,3,15};
		int k=1;
		System.out.println(subarraysWithSumK(a,k));
	}
	public static int subarraysWithSumK(int a[],int k)
	{
		int count=0,i=0,j=0,n=a.length,sum=0;
		while(j<n) 
		{
			sum+=a[j];
			if(sum<=k)
			{
				count+=j-i+1;
				j++;
			}
			else if(sum>k)
			{
				while(sum>k && i<=j) //can we use if instead of while?
				{
					sum-=a[i];
					i++;
				}
				if(sum<=k && sum!=0)
					count+=j-i+1;
				j++;
			}
		}
		return count;
	}
}