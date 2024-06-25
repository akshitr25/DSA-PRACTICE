package com.dsa.hashing;

import java.util.Scanner;

public class HASH8 {
	public static void main(String as[])
	{//TC->O(N+Q)
		//Hash13, pre req.
		//given an array, in 1 operation, can change a[i] to a[i]+x. only 1 time on each index. x lies bw -k to k.
		//print the final array.
		//now, queries will be n
		Scanner sc=new Scanner(System.in);
		System.out.print("SIZE: ");
		int n=sc.nextInt(),sum=0;
		int a[]=new int[n+1];
		int b[]=new int[1000000];
		System.out.print("\nARRAY: ");
		for(int i=1;i<=n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("\nK: ");
		int k=sc.nextInt();
		int i=1,max=1;
		while(i<=n)
		{
			int l=a[i]-k;
			int r=a[i]+k;
			b[l]=b[l]+1;
			b[r+1]=b[r+1]-1;
			i++;
		}
		i=1;
		while(i<=100000)
		{
			b[i]=b[i-1]+b[i];
			max=Math.max(b[i],max);
			i++;
		}
		System.out.println(max);
//		5 3 
//		4 5 8 10 15 
//		while(k<=q) //TC->O(N*Q)
//		{
//			int l=3,r=6; //take i/p
//			for(int i=l;i<=r;i++)
//				a[i]++;
//			k++;
//			for(int j=0;j<n;j++)
//				System.out.print(a[j]+" ");
//			System.out.println();
//		}
	}
}
