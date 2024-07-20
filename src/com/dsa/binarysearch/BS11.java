package com.dsa.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BS11 {
	public static void main(String as[])
	{//BS 10
//		Arranging coins in increasing values(1,2,3,4.....)
//		TC logN, SC 1
		int n=10;
		System.out.println(arrangeCoins(n));
	}
	static int arrangeCoins(int n) {
        long low=0;
        long high=n;
        long count=0;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            long coins=mid*(mid+1)/2;
            if(coins==n)
                return (int)mid;
            else if(coins>n)
                high=mid-1;
            else
                low=mid+1;
        }
        return (int)high;
    }
}