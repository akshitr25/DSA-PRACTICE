package com.dsa.dp;

import java.util.Scanner;

public class DP28 { 
	public static void main(String as[])
	{
//		S-21 8 JULY OA CHALLENGE
//		There are N tasks. To be performed on N days; each day you perform a single task 
//Each day you have three choices; either perform the easy[i] , medium [i] , hard[i] 
//For doing each task you get some points. 
//Maximize the total points. 
//On day “i” you can do a hard task if and only if the day before the previous day you did an easy task 
//On day “i” you can do a medium task if and only if the day before you did easy task and the day before that you did medium task 
//Applicable from day>2. 
		int easy[]={1,2,3,4,5}; 
		int medium[]={2,3,6,8,10}; 
		int hard[]={3,6,9,12,15}; 
		int n=easy.length;
//		0 based indexing
		int dp_easy[]=new int[n+1]; //o/p: 35
		int dp_medium[]=new int[n+1];
		int dp_hard[]=new int[n+1];
		dp_easy[0]=easy[0];
		dp_medium[0]=medium[0];
		dp_hard[0]=hard[0];
		//can do anything on day2
		dp_easy[1]=max(dp_easy[0],dp_medium[0],dp_hard[0])+easy[1];
		dp_medium[1]=max(dp_easy[0],dp_medium[0],dp_hard[0])+medium[1];
		dp_hard[1]=max(dp_easy[0],dp_medium[0],dp_hard[0])+hard[1];
		//follow the rules from day 2.
		dp_easy[2]=max(dp_easy[1],dp_medium[1],dp_hard[1])+easy[2];
		dp_medium[2]=medium[0]+easy[1]+medium[2]; //only way: i-2 medium, then i-1 easy, then i is medium day.
		dp_hard[2]=easy[0]+max(easy[1],medium[1],hard[1])+hard[2]; //can do i hard only if i-2 was easy day. 
		for(int i=3;i<n;i++)
		{
			dp_easy[i]=max(dp_easy[i-1],dp_medium[i-1],dp_hard[i-1])+easy[i];
			dp_medium[i]=dp_medium[i-2]+easy[i-1]+medium[i];
//			3 ways for hard (max of these 3 will be picked):
			// i-2 easy, i-1 easy, i hard.
			// i-2 easy, i-1 medium (so i-3 has to be medium), i hard
			// i-2 easy, i-1 hard, i hard.
			dp_hard[i]=dp_easy[i-2]+easy[i-1]
+hard[i]; //easy,then easy, then hard
			dp_hard[i]=Math.max(dp_hard[i],dp_medium[i-3]+easy[i-2]+medium[i-1]+hard[i]); //either previous one, or medium,easy,medium,hard
			dp_hard[i]=Math.max(dp_hard[i],dp_easy[i-3]+easy[i-2]+hard[i-1]+hard[i]);// either prev one, or easy,easy,hard,hard
		}
		System.out.println(max(dp_easy[n-1],dp_medium[n-1],dp_hard[n-1]));
	}
	static int max(int a,int b,int c)
	{
		return Math.max(Math.max(a,b),c);
	}
}