package com.dsa.hashing;

import java.util.Scanner;

public class HASH9 {
	public static void main(String as[])
	{
		//given an array of size N and all elements are 0.
		//given Q queries : [L,R]
		//have to add 1 to all elements from [L,R]
		//0 0 0 0 0 0 0
		//
		Scanner sc=new Scanner(System.in);
		System.out.print("SIZE: ");
		int n=sc.nextInt();
		int a[]=new int[n+1];
//		int b[]=new int[n+1];
//		for(int i=1;i<=n;i++)	
//			a[i]=sc.nextInt();
		System.out.print("\nQUERIES: ");
		int q=sc.nextInt();
		int i=1;
		while(i<=q)
		{
			System.out.print("\nLEFT: ");
			int l=sc.nextInt();
			System.out.print("\nRIGHT: ");
			int r=sc.nextInt();
			a[l]=1;
			a[r+1]=-1;
			i++;
		}
		for(int j=1;j<=n;j++)
			a[j]=a[j]+a[j-1];
		System.out.println("ANSWER: ");
		for(int j=1;j<=n;j++)
			System.out.print(a[j]+" ");
	}
}

//8
//2
//1 5
//2 6
//1 2 2 2 2 1 0 0 