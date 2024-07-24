package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HASH76 {
	public static void main(String as[])
	{// hash 55
//		Particular timestamps are given in which some packets are sent in the system. Also at each second, y packets will be removed from the system. Also ; at any second if the total number of packets > max_capacity ; then you are supposed to remove all the extra packets. The question is asking total how many packets you will have to remove in this process. 
//		BF TC N SC N *2=>N
		int a[][]={{1,8},{4,9},{6,7}},n=a.length;
		//1 : 8
		//2 : 6
		//3 : 4
		//4 : 11-1=10
		//5 : 8
		//6 : 13-3=10
		//7 : ....... ans=4
		int rate=2,max_packets=10,ans=0,packets=0,maxtime=0;
		Map<Integer,Integer> map=new HashMap<>(); //time, packet
		for(int i=0;i<n;i++)
		{
			map.put(a[i][0],a[i][1]);
			maxtime=Math.max(maxtime,a[i][0]);
		}
		int i=0;
		while(i<n)
		{
			int t=a[i][0];
			packets+=map.get(t);
			if(packets>max_packets)
			{
				int drop=packets-max_packets;
				ans+=drop;
				packets=max_packets;
			}
			if(i<=n-2)
			{
				int next=a[i+1][0];
				int diff=next-t;
				packets-=diff*rate;
			}
			i++;
		}
		System.out.println(ans);
	}
}