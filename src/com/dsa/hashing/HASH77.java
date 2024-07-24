package com.dsa.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HASH77 {
	public static void main(String as[])
	{// hash 56
//		APPLICATION AUTO DETECTS THE WORDS WHICH APPEARS MORE THAN ONCE.
//		ALGORITHM TO IDENTIFY WHICH WORD WILL BE SAVED IN DICTIONARY.
//		PRINT THOSE WORDS IN LEXICOGRAPHICAL ORDER. (like dictionary order)
//		TC N, SC N
		String s="batman latt matter cat matter bat cat bat"; //cat batman latt matter cat matter cat
		String a[]=s.split(" ");
		Map<String,Integer> map=new HashMap<>();
		for(String i:a)
			map.put(i,map.getOrDefault(i,0)+1);
		List<String> list=new ArrayList<>();
		for(String key:map.keySet())
		{
			if(map.get(key)>1)
				list.add(key);
		}
		System.out.println(map);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		for(String i:list)
			System.out.print(i+" ");
	}
}