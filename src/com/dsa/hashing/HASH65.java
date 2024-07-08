package com.dsa.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HASH65 {
	public static void main(String as[])
	{// hash 47!
//		You are given a 0-indexed integer array arr, and an m x n integer matrix mat. arr and mat both contain all the integers in the range [1, m * n].
//		Go through each index i in arr starting from index 0 and paint the cell in mat containing the integer arr[i].
//		Return the smallest index i at which either a row or a column will be completely painted in mat.
		int a[]={2,8,7,4,1,3,5,6,9},mat[][]={{3,2,5},{1,4,6},{8,7,9}};
//		int a[]={1,3,4,2},mat[][]={{1,4},{2,3}};
		//hash the value of matrix to the index of that val in array. (which means that if we want to color this value, we need to reach that particular index.
		int an=a.length,n=mat.length,m=mat[0].length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<an;i++)
        {
            map.put(a[i],i);//val,index
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int max=0;
            for(int j=0;j<m;j++)
                max=Math.max(max,map.get(mat[i][j]));
            ans=Math.min(max,ans);
        }
        for(int i=0;i<m;i++)
        {
            int max=0;
            for(int j=0;j<n;j++)
                max=Math.max(max,map.get(mat[j][i]));
            ans=Math.min(max,ans);
        }
		System.out.println(ans);
	}
}
