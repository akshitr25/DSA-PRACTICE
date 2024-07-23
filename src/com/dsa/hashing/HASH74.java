package com.dsa.hashing;

public class HASH74 {
	public static void main(String as[])
	{// hash 54
//		We will give you a string only consisting of “a” and “b” ; now convert it to a string such that there is no subset like “bab” or “aba” ; do this in minimum cost. 
//Cost : 1 for flipping a into b or b into a. 
//		TC 3*N=>N, SC 4*N=>N
		String s="babbababababbabb"; //bbbaaaaab | aaabbbba
//		abbaabaab->
//		abbbbbbbb => 4
		int n=s.length();
		int prefa[]=new int[n];
		int prefb[]=new int[n];
		if(s.charAt(0)=='b')
			prefa[0]=1;
		else if(s.charAt(0)=='a')
			prefb[0]=1;
		for(int i=1;i<n;i++)
		{
			if(s.charAt(i)=='b')
			{
				prefa[i]=prefa[i-1]+1;
				prefb[i]=prefb[i-1];
				
			}
			else if(s.charAt(i)=='a')
			{
				prefa[i]=prefa[i-1];
				prefb[i]=prefb[i-1]+1;
			}
		}
		int suffb[]=new int[n];
		int suffa[]=new int[n];
		if(s.charAt(n-1)=='a')
			suffb[n-1]=1;
		else if(s.charAt(n-1)=='b')
			suffa[n-1]=1;
		for(int i=n-2;i>=0;i--)
		{
			if(s.charAt(i)=='a')
			{
				suffb[i]=suffb[i+1]+1;
				suffa[i]=suffa[i+1];
			}
			else if(s.charAt(i)=='b')
			{
				suffb[i]=suffb[i+1];
				suffa[i]=suffa[i+1]+1;
			}
		}
		int min=n;
		for(int i=0;i<n-1;i++)
		{
			int cost1=prefa[i]+suffb[i+1];
			int cost2=prefb[i]+suffa[i+1];
			int cost=Math.min(cost1,cost2);
			min=Math.min(min,cost);
		}
		System.out.println(min);
	}
}