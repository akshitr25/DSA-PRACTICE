package com.dsa.hashing;

import java.util.Scanner;

public class HASH51 {
	public static void main(String as[])
	{// hash 37!
//		PRE REQ: MODULO FORMULAE
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt(),y=sc.nextInt(),k=sc.nextInt();
		int a=(x%k+y%k)%k;
		int b=(x%k*y%k)%k;
		int c=(x%k-y%k+k)%k;
		System.out.println("(x+y)%k="+a);
		System.out.println("(x*y)%k="+b);
		System.out.println("(x-y)%k="+c);
	}
}
