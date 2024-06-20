package com.dsa.slidingwindow;

public class SW17 {
	public static void main(String as[])
	{
//		FIND MAX PRODUCT SUBARRAY FOR GIVEN ARRAY, RETURN PRODUCT
//		OPTIMAL TC:O(N), SC:O(1)
		int a[]= {2,3,-2,4},n=a.length;
		int prefix=1,suffix=1;
		int maxProduct=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(prefix==0)
				prefix=1;
			if(suffix==0)
				suffix=1;
			prefix*=a[i];
			suffix*=a[n-1-i];
			maxProduct=Math.max(maxProduct,Math.max(prefix, suffix));
		}
		System.out.println(maxProduct);
	}
}