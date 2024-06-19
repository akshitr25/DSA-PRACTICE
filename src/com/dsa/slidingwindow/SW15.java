package com.dsa.slidingwindow;

public class SW15 {
	public static void main(String as[])
	{
//		Given two strings A and B, find if A is a subsequence of B, if yes then find how many chars to be appended to make 'b' a substring of 'a'
//		OPTIMAL TC:O(N), SC:O(1)
		int ans=0;
		String a="ABCZ",b="AZDB"; //
		int i=0,j=0,na=a.length(),nb=b.length();
		while(i<na && j<nb)
		{
			char ca=a.charAt(i),cb=b.charAt(j);
			if(ca==cb)
			{
				i++;
				j++;
			}
			else
				i++;
		}
		ans=nb-j;
		System.out.println(ans);
	}
}