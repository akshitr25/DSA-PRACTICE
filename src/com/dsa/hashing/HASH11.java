package com.dsa.hashing;

import java.util.Scanner;

public class HASH11 {
	public static void main(String as[])
	{//my code is not working, not sure why. approach is correct.
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//no of people/schedules
		int k=sc.nextInt();//meeting duration
		int y[]=new int[1440];
		String start,end,a,b;
		for(int i=0;i<n;i++)
		{
			a=sc.next(); //just name and task, no use of this a and b.
			b=sc.next();
			start=sc.next();
			end=sc.next();
			int tstart=convert(start);
			int tend=convert(end);
			for(int j=tstart;j<=tend;j++)
				y[j]=y[j]+1;
		}
		int c=0;
		int g=0;
		for(int i=0;i<1440;i++) //1440 minutes in a day
		{
			if(y[i]==0)
			{
				c++;
				if(c==k)
				{
					convertIntegerToTimeString(i-k+1);
					g=1;//flag
					break;
				}
				else	c=0;
			}
		}
		if(g==0)	System.out.println("-1");
	}
	static int convert(String time) //11:32
	{
		int t1=time.charAt(0)-'0';
		int t2=time.charAt(1)-'0';
		int mins1=(t1*10+t2)*60; //to minutes
		int t3=time.charAt(3)-'0';
		int t4=time.charAt(4)-'0';
		int mins2=t3*10+t4;
		return mins1+mins2;
	}
	static void convertIntegerToTimeString(int time)
	{
		int hr=time/60;
		int min=time%60;
		if(hr<=9)
		{
			System.out.print("0"+hr);
		}
		else	System.out.print(hr);
		System.out.print(":");
		if(min<=9)
		{
			System.out.print("0"+min);
		}
		else	System.out.print(min);
	}
}

//15 3 6 
//1 7 
//5 11
//7 9 
//7 1 5 10 9 14 