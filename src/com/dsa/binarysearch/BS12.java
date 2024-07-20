package com.dsa.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BS12 {
	public static void main(String as[])
	{//BS 11
//		You are given an array of characters  that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
//Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
//		
		char a[]={'c','f','j'},k='e';
		System.out.println(nextGreatestLetter(a,k));
    }
	static char nextGreatestLetter(char[] a, char k) {
        int n=a.length,left=0,right=n-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            char c=a[mid];
            if(c<=k)
            {
                left=mid+1;
            }
            else if(c>k)
            {
                if(mid>0 && a[mid-1]>k)
                    right=mid-1;
                else
                    return a[mid];
            }
        }
        return a[0];
    }
}