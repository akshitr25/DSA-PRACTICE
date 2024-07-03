package com.dsa.hashing;

import java.util.Scanner;

public class HASH47 {
	public static void main(String as[])
	{// hash 34!
//		Given a string, and q queries (l,r), find number of substrings having same first and last element 
//		NO OF SUBSTRINGS IN THE SUBSTRING (L,R) WHICH START AND END WITH SAME CHAR
//		q<=10^5
//		TC N*26=>N SC N*26=>N
		Scanner sc =new Scanner(System.in);
		String s="abcaab";
		System.out.println(s);
		int q=sc.nextInt(),n=s.length(),count=0;
		int pref[][]=new int[n+1][26];
		for(int i=0;i<n;i++)
		{
			int e=s.charAt(i)-'a';
			for(int j=0;j<26;j++)
			{
				pref[i+1][j]=(e==j?1:0)+pref[i][j];
//				OR
				//pref[i+1][j]=(e==j)?1:0;
				//pref[i+1][j]+=pref[i][j];
			}
			
		}
		for(int i=1;i<=q;i++)
		{
			int l=sc.nextInt(),r=sc.nextInt();
			int ans=0;
			for(int j=0;j<26;j++)
			{
				int freq=pref[r][j]-pref[l-1][j];
				ans+=freq*(freq+1)/2;
			}
			System.out.print(ans+" ");
		}
	}
}
/*
4
1 1
2 5
3 6
*/