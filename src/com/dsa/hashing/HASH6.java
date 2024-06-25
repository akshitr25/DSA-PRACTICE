package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH6 {
	public static void main(String as[])
	{
		String log="abacbc"; //a2 b2 c2
		int ln=log.length();
		String target="bca"; //a1 b1 c1
		int tn=target.length();
		Map<Character,Integer> map1=new HashMap<>();
		Map<Character,Integer> map2=new HashMap<>();
		for(int i=0;i<ln;i++)
		{
			char c=log.charAt(i);
			map1.put(c,map1.getOrDefault(c,0)+1);
		}
		for(int i=0;i<tn;i++)
		{
			char c=target.charAt(i);
			map2.put(c,map2.getOrDefault(c,0)+1);
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<tn;i++)
		{
			char c=target.charAt(i);
			if(!map1.containsKey(c))
			{
				System.out.println(0);
                return;
			}
			int div=map1.get(c)/map2.get(c);
			min=Math.min(min,div);
		}
		System.out.println(min);
	}
}
