package com.dsa.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HASH84 {
	public static void main(String as[])
	{// hash 62
//		Remove anagrams of string from  a string array. Keep only the first occurrence of those anagrams.
//		TC N, SC N
		List<String> list=new ArrayList<>();
		list.add("code");
		list.add("doce");
		list.add("ecod");
		list.add("framer");
		list.add("frame");
		int n=list.size();
		list=solve(list);
		System.out.println(list);
	}
	static List<String> solve(List<String> list) {
		List<String> ans=new ArrayList<>();
		int frep[]=new int[26];
		int frec[]=new int[26];
		ans.add(list.get(0));
		for(char c:list.get(0).toCharArray())
			frep[c-'a']++;
		int n=list.size();
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<26;j++)
				frec[j]=0;
			for(char c:list.get(i).toCharArray())
				frec[c-'a']++;
			if(!isEqual(frec,frep))
			{
				ans.add(list.get(i));
				frep=frec.clone();
			}
		}
		return ans;
	}
	private static boolean isEqual(int a1[],int a2[])
	{
		for(int i=0;i<26;i++)
		{
			if(a1[i]!=a2[i])
				return false;
		}
		return true;
	}
}