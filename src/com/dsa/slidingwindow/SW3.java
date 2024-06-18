package com.dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class SW3 {
	public static void main(String as[])
	{
		//GIVEN A STRING WHICH CONSISTS OF CHARS FROM 0 TO 9. FIND NO OF SUBSTRINGS WHICH CONTAIN CHAR 5 , K TIMES.
		//OPTIMAL TC:O(N), SC:O(N)
		String s="00858005";//"00555105";//"00888005"; //0-2,1-1,2-2,3-6
		int k=2,ans=0,sum=0,count=0,startidx=0;
		//create a hashmap, store freq['5'] and freq[freq['5']] 
		Map<Integer,Integer> map=new HashMap<>();
		map.put(0,1); //?
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(j)=='5')
			{
				count++;
			}
			startidx=count-k;
			sum+=map.getOrDefault(startidx,0);
			map.put(count,map.getOrDefault(count,0)+1);
		}
		System.out.println("ANSWER: "+sum);
	}
}
