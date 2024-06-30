package com.dsa.hashing;

import java.util.ArrayList;
import java.util.List;

public class HASH31 {
	static int matching(String a,String b)
	{
		int count=0;
		for(int i=0;i<Math.min(a.length(),b.length());i++)
		{
			if(a.charAt(i)==b.charAt(i))	count++;
		}
		return count;
	}
	public static void main(String as[])
	{// hash 26!
//		For each string at index “i” you have to print the sum of matching characters of string “i” with string - “i+1” “i+2” “i+3” “i+4” “i+5” …… and so on. 
//		BF TC O(S^2), SC O(26*S=>S) 
//		column wise apporach, efficient. 2d array with 26 cols.
//		S=sum of all string length
		String[] s= {"abc", "ade", "abc"};//"bbz","zaz","aaa","zaa","zzz"
		int ns=s.length,n=s[0].length(),count=0,ans=0;
		int track[][]=new int[20000][27];
//		int finalans[]=new int[n+2];
		List<Integer> finalans=new ArrayList<>(n);
//		0->a, 1->b, 2->c, 3->d, 4->d
		for(int i=ns-1;i>=0;i--)
		{
			String word=s[i];
			count=0;
			int len=word.length();
			for(int j=0;j<len;j++)
			{
				int num=(int)word.charAt(j)-97;
				count+=track[j][num];
				track[j][num]++;
			}
			finalans.add(count);
		}
		for(int i=finalans.size()-1;i>=0;i--)
			System.out.print(finalans.get(i)+" ");
	}
}
