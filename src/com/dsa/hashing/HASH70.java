package com.dsa.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HASH70 {
	public static void main(String as[])
	{// hash 52!
//		FIND THE CHARACTER THAT APPEARS MOST OFTEN ACROSS ALL POSSIBLE SUBSTRINGS OF A GIVEN STRING. 
//		IF THERE ARE SEVERAL CHARACTERS WITH THE HIGHEST FREQUENCY, PRINT THE ONE THAT IS SMALLEST IN LEXICOGRAPHICAL ORDER.
//		BF TC N^3, SC O(26)=>O(1)
		String s="abca";
		int n=s.length();
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
//				travel the substring from i to j
				for(int k=i;k<=j;k++)
				{
					char c=s.charAt(k);
					map.put(c,map.getOrDefault(c,0)+1);
				}
			}
		}
		int max=0;
		char ans='1';
		for(char key:map.keySet())
		{
			int freq=map.get(key);
			if(freq>max)
			{
				max=freq;
				ans=key;
			}
		}
		System.out.println(ans+" "+max);
	}
}