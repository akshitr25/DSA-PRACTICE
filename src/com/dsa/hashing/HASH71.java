package com.dsa.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HASH71 {
	public static void main(String as[])
	{// hash 51!
//		FIND THE CHARACTER THAT APPEARS MOST OFTEN ACROSS ALL POSSIBLE SUBSTRINGS OF A GIVEN STRING. 
//		IF THERE ARE SEVERAL CHARACTERS WITH THE HIGHEST FREQUENCY, PRINT THE ONE THAT IS SMALLEST IN LEXICOGRAPHICAL ORDER.
//		OPTIMAL TC N, SC 26=>1
//		Contribution Technique :- For each char you can easily count in how many substrings does it occur using the formula:- x*y + x + y + 1 
//		x = left space; y = right space.
		String s="abca";
		int n=s.length();
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int x=i,y=n-1-i;
			int combo=x*y+x+y+1;
			char c=s.charAt(i);
			map.put(c,map.getOrDefault(c,0)+combo);
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