package com.dsa.bitmanipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BM1 {
	public static void main(String as[])
	{
		int n=28;
		List<Integer> bin=new ArrayList<>();
//		DECIMAL TO BINARY
		while(n>0)
		{
			bin.add(n%2);
			n/=2;
		}
		System.out.println(bin);
		Collections.reverse(bin);
		System.out.println(bin);
//		BINARY TO DECIMAL
		
//		System.out.println();
	}
}
