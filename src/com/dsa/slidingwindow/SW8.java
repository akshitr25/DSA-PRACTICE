package com.dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class SW8 {
	public static void main(String as[])
	{
//		Count number of substrings having at least K distinct characters
//		OPTIMAL TC:O(N), SC:O()1
		String s="abccd";
		int k=3;
		System.out.println(atleastKDistinctChars(s,k));
	}
	public static int atleastKDistinctChars(String s,int k)
	{
		int i=0,j=0,ans=0,n=s.length();
		Map<Character,Integer> map=new HashMap<>();
		while(j<n)
		{
			char cj=s.charAt(j);
			map.put(cj,map.getOrDefault(cj,0)+1);
			j++;
			while(i<=j && map.size()>=k)
			{
				char ci=s.charAt(i);
				map.put(ci,map.getOrDefault(ci,0)-1);
				if(map.get(ci)==0)	map.remove(ci);
				ans+=n-j+1;
				i++;
			}
		}
		return ans;
	}
}
