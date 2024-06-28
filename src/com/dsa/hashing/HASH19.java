package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH19 {
	public static void main(String as[])
	{// hash 21 P0
//		You are given string a and string b ; you have to output Yes ; if both of the strings can be made equal by doing some specific operations. 
//		-> You can swap any index element with any other index element of same string 
		String a="bcdef";//tggb bggbdd
		String b="defbc";//ggtb ggbbdd
		int na=a.length();
		int nb=a.length();
		Map<Character,Integer> mapa=new HashMap<>();
		Map<Character,Integer> mapb=new HashMap<>();
		for(int i=0;i<na;i++)
		{
			mapa.put(a.charAt(i),mapa.getOrDefault(a.charAt(i),0)+1);
		}
		for(int i=0;i<na;i++)
		{
			mapb.put(b.charAt(i),mapb.getOrDefault(b.charAt(i),0)+1);
		}
		for(Map.Entry e:mapa.entrySet())
		{
			char c=(char)e.getKey();
			int freq=(int)e.getValue();
			if(freq!=mapb.getOrDefault(c,0))
			{
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
