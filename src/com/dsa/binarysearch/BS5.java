package com.dsa.binarysearch;

public class BS5 {
	public static void main(String as[])
	{
		// FIND NTH ROOT OF A NUMBER M
		//TC: O(logN) SC: O(1)
		int n=3,m=27;
        double ans=nthRoot(n,m);
        System.out.print(ans);
	}
	public static double nthRoot(int n,int m)
    {
		double l=1,r=m;
		while(r-l>(1e-8))
		{
			double mid=(l+r)/2;
			if(lte(mid,n,m))
				l=mid;
			else	r=mid;
		}
		return l;
    }
	public static boolean lte(double a,int n,int m)
	{
		int res=1;
		while(n>0)
		{
			if(n%2==1)
			{
				res*=a;
				n--;
			}
			else
			{
				n/=2;
				a*=a;
			}
		}
		return res<=m;
//		for(int i=1;i<=n;i++)
//		{
//			res*=a;
//			if(res>m)	return false;
//		}
//		return true;
	}
}