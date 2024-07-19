import java.util.HashMap;
import java.util.Map;

public class July16P1 {
	//16 JULY OA CHALLENGE
	//You are given an array of size “N”; try to find the maximum number of pairs whose sum is “K”; but “K” is unknown. Fix such a K ; that the number of pairs comes as maximum!
//	TC N^3, SC N
	public static void main(String as[]) {
		int a[]={1,2,1,2,5,5,1,2};
		//1,2,3,4
		int maxpairs=0,n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int k=a[i]+a[j];
				int pairs=findPairs(a,k);
				maxpairs=Math.max(maxpairs, pairs);
			}
		}
		System.out.println(maxpairs);
	}
	static int findPairs(int a[],int k)
	{
		int n=a.length,pairs=0;
		Map<Integer,Integer> freq=new HashMap<>(); //element, frequency
		Map<Integer,Integer> check=new HashMap<>(); //element, already in other pairs or not
		for(int i:a)
			freq.put(i,freq.getOrDefault(i,0)+1);
		for(int i=0;i<n;i++)
		{
			int find=k-a[i];
			if(!check.containsKey(a[i])) //current element should not be already taken
			{
				if(find==a[i] && !check.containsKey(a[i])) //k=2*a[i] / a+a=k / a=b
				{
					pairs+=freq.get(a[i])/2;
					check.put(a[i],1);
				}
				else if(freq.containsKey(find) && !check.containsKey(a[i])) //2 elements different
				{
					int freq1=freq.get(a[i]);
					int freq2=freq.get(find);
					pairs+=Math.min(freq1, freq2);
					check.put(a[i],1);
					check.put(find,1);
				}
			}
		}
		return pairs;
	}
}
