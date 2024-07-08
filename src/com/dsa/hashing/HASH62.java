package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HASH62 {
	public static void main(String as[])
	{// hash 44!
//		https://www.codechef.com/START66B/problems/GOODBINSTR
//		return number of indices i such that when Si is flipped, the string has equal occurrences of 01 and 01.
		String s="10100";
		int x=0,y=0,n=s.length(); //x->01,y->10
		System.out.println(solve(s));
	}
	static int solve(String s)
	{
		int n=s.length();
		if(s.charAt(0)!=s.charAt(n-1)) //first and last different
			return 2;
		else //first and last same
			return n-2;
	}
}
