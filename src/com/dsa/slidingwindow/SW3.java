package com.dsa.slidingwindow;

public class SW3 {
	public static void main(String as[])
	{
		//GIVEN A STRING WHICH CONSISTS OF CHARS FROM 0 TO 9. FIND NO OF SUBSTRINGS WHICH CONTAIN CHAR 5 , K TIMES.
		String s="00888005";
		int k=1,ans=0;
		for(int i=0;i<=s.length();i++)
		{
			int count=0;
			for(int j=i;j<s.length();j++)
			{
				if(s.charAt(j)=='5')
					count++;
				if(count==k) {
					ans++;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
