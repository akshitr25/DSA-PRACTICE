import java.util.HashMap;
import java.util.Map;

public class July16 {
	//16 JULY OA CHALLENGE
	//P0 You are given an integer array nums and an integer k.
//In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
//Return the maximum number of operations you can perform on the array.
	//a+b=k => b=k-a
	public static void main(String as[]) {
		int a[]={1,2,3,4},k=5;
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
		System.out.println(pairs);
	}
}
