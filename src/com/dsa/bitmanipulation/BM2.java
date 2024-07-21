package com.dsa.bitmanipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BM2 {
	public static void main(String as[])
	{
//		Given two integers : 
//Y and K ; find minimum possible such that Z ; such that 
//Y | Z = K ; where “|” means BitWise OR 
//If it is not possible then print -1. 
		int y=10,k=15,z;
		int d=0,ans=0;
		for(int i=10;i>=0;i--)
		{
			int start=0;
			int g=y>>i;
			if((g&1)==1)
				start=1;
			else
				start=0;
			int finalbit=0;
			g=k>>i;
			if((g&1)==1)
				finalbit=1;
			else
				finalbit=0;
			if(start==finalbit)
			{
				
			}
			else
			{
				if(start==0)
				{
					ans|=(1<<i);
				}
				else
					d=-1;
			}
		}
		if(d==-1)
			System.out.println(d);
		else
			System.out.println(ans);
	}
}
