package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH20 {
	public static void main(String as[])
	{// hash 21
//		You are given string a and string b ; you have to output Yes ; if both of the strings can be made equal by doing some specific operations. 
//		-> You can swap any even index element with any other even index element of same string OR
//		-> yOU CAN SWAP any odd index element with any other odd index element of same string 
// 
		String a="bcdef";//tggb bggbdd
		String b="defbc";//ggtb ggbbdd
		int na=a.length();
		int nb=a.length();
		Map<Character,Integer> mapa1=new HashMap<>();
		Map<Character,Integer> mapb1=new HashMap<>();
		Map<Character,Integer> mapa2=new HashMap<>();
		Map<Character,Integer> mapb2=new HashMap<>();
		for(int i=0;i<na;i++)
		{
			if(i%2!=0)
				mapa1.put(a.charAt(i),mapa1.getOrDefault(a.charAt(i),0)+1);
			else
				mapa2.put(a.charAt(i),mapa2.getOrDefault(a.charAt(i),0)+1);
		}
		for(int i=0;i<nb;i++)
		{
			if(i%2!=0)
				mapb1.put(b.charAt(i),mapb1.getOrDefault(b.charAt(i),0)+1);
			else
				mapb2.put(a.charAt(i),mapb2.getOrDefault(a.charAt(i),0)+1);
		}
		System.out.println(mapa1.equals(mapb1) && mapb2.equals(mapb2));
//		for(Map.Entry e:mapa1.entrySet())
//		{
//			char c=(char)e.getKey();
//			int freq=(int)e.getValue();
//			if(freq!=mapb1.getOrDefault(c,0))
//			{
//				System.out.println("NO");
//				return;
//			}
//		}
//		for(Map.Entry e:mapa2.entrySet())
//		{
//			char c=(char)e.getKey();
//			int freq=(int)e.getValue();
//			if(freq!=mapb2.getOrDefault(c,0))
//			{
//				System.out.println("NO");
//				return;
//			}
//		}
	}
}
