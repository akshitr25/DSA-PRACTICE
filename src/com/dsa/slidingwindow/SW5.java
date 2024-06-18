package com.dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class SW5 {
	public static void main(String as[])
	{
		//FIND NO OF SUBSTRINGS IN WHICH FREQUENCY OF ALL ELEMENTS=K.
		//BUT OPTIMAL: TC: O(n*10), SC: O(1)
		//size of substring can only be a multiple of k. k,2k,3k,.....,10k. (as 0->9 only)
		String s="110022";
		int k=2,ans=0,num=0,p=1,count=0;
		Map<Integer,Integer> map=new HashMap<>();
		while(p<=10)
		{
			int t=p*k; //sliding window size
			for(int i=0;i<=s.length();i++)
			{
				if(i<p)//(i<k)
				{
					num=(int)s.charAt(i);
					map.put(num,map.getOrDefault(num,0)+1);
				}
				else
				{
					if(i<s.length())	
					{
						num=(int)s.charAt(i);
						map.put(num,map.getOrDefault(num,0)+1);
						int l=0,flag=0;
						while(l<=9)
						{
							if(map.getOrDefault(l,0)==k || map.getOrDefault(l,0)==0)
							{
								
							}
							else
							{
								flag=1;
							}
							l++;
						}
						if(flag==0)	count++;
						if(i-k+1>=0)
						{
							int y=(int)s.charAt(i-k+1);
							map.put(y,map.getOrDefault(y,0)-1);
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
