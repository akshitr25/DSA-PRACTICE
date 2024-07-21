import java.util.HashMap;
import java.util.Map;

public class July21 {
	//21 JULY OA CHALLENGE
//	We are given an array of size N ; we are told to pick up any 2 numbers from the array such that their digit sum is equal ; if their digit sum is equal ; calculate their sum ; question is saying to find the maximum possible sum 
//	TC N, SC max(digitsum)->1
	public static void main(String as[])
	{
		int a[]={51,71,17,42},n=a.length,maxsum=Integer.MIN_VALUE; //6 8 8 6
//		other ex: 51,71,17,42,101,200, maxsum=301
		Map<Integer,Integer> map=new HashMap<>(); //digitsum,a[i]
		for(int i=0;i<n;i++)
		{
			int digitsum=digitsum(a[i]);
			if(map.containsKey(digitsum))
			{
				int prev=map.get(digitsum);
				maxsum=Math.max(maxsum,a[i]+prev);
				map.put(digitsum,Math.max(prev,a[i]));
			}
			else
				map.put(digitsum,a[i]);
		}
		System.out.println(maxsum);
	}
	static int digitsum(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
}
