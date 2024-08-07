package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH82 {
	public static void main(String as[])
	{// hash 60
//		Given a (binary) string of zeros and ones ; find the number of subarrays which have equal no of 1s and 0s, and all 0s should be grouped together and same for 1s.
//		TC N, SC N
		String s="000111000";
		int n=s.length(),ans=0;
		int zero[]=new int[n];
		int one[]=new int[n];
		if(s.charAt(0)=='0')
			zero[0]=1;
		for(int i=1;i<n;i++)
		{
			if(s.charAt(i)=='0')
				zero[i]=zero[i-1]+1;
			else
				zero[i]=0;
		}
		if(s.charAt(0)=='1')
			one[0]=1;
		for(int i=1;i<n;i++)
		{
			if(s.charAt(i)=='1')
				one[i]=one[i-1]+1;
			else
				one[i]=0;
		}
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)=='0')
			{
				int idx=i-zero[i];
				if(idx>=0)
				{
					if(one[idx]>=zero[idx])
						ans++;
				}
			}
			else
			{
				int idx=i-one[i];
				if(idx>=0)
				{
					if(zero[idx]>=one[i])
						ans++;
				}
			}
		}
		System.out.println(ans);
	}
}