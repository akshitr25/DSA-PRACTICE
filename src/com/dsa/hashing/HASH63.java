package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HASH63 {
	public static void main(String as[])
	{// hash 45!
//		GIVEN A DATE STRING IN FORMAT DAY MONTH YEAR, CONVERT TO YYYY-MM-DD
//		ex: 5th Nov 2000 -> 2000-11-05
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date: ");
		String s=sc.nextLine();
		Map<String,String> map=new HashMap<>();
		map.put("Jan","01");
		map.put("Feb","02");
		map.put("Mar","03");
		map.put("Apr","04");
		map.put("May","05");
		map.put("Jun","06");
		map.put("Jul","07");
		map.put("Aug","08");
		map.put("Sep","09");
		map.put("Oct","10");
		map.put("Nov","11");
		map.put("Dec","12");
		System.out.println();
		String day="";
		String month="";
		String year="";
		String s1[]=s.split(" ");
		if(s1[0].length()>3) //11
		{
			day=s1[0].substring(0,2);
			month=map.get(s1[1]);//s.substring(0)
			year=s1[2];
		}
		else //1
		{
			day="0"+s1[0].substring(0,1);
			month=map.get(s1[1]);
			year=s1[2];
		}
		System.out.println(year+"-"+month+"-"+day);
		
	}
}
