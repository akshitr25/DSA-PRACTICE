package com.dsa.slidingwindow;

public class SW14 {
	public static void main(String as[])
	{
//		Given two strings A and B, find if A is a subsequence of B.
//		OPTIMAL TC:O(N), SC:O(1)
		boolean ans=false;
		String a="AXY",b="YADXCP";
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
				j++;
		}
		if(i==na)	ans=true;
		else ans=false;
		System.out.println(ans);
	}
}