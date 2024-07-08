import java.util.HashMap;
import java.util.Map;

public class July6 {
	public static void main(String[] args) {
//		GIVEN AN ARRAY, AT MOST, CAN PICK ANY ELEMENT OF THE ARRAY AND CHANGE IT TO 0.
//		NEED TO MAXIMIZE THE NUMBER OF PARTITION OF GIVEN ARRAY SUCH THAT AFTER PARTITION, SUM OF FIRST SUBARRAY IS EQUAL TO SUM OF ANOTHER SUBARRAY.
//		RETURN NO OF WAYS FOR PARTITION.
//		FIRST, JUST FIND HOW MANY SUBARRAYS CAN BE MADE.
//		N<=10^5
//		-10^9<=a[i]<=10^9
//		TC SC
		int a[]={-1, 5,0,0,5 ,0},n=a.length,totalsum=0,sum=0,count=0,max=Integer.MIN_VALUE; //-1,5,0,0,5,0
		Map<Integer,Integer> prefsum=new HashMap<>();//prefsum and freq of that prefsum
		Map<Integer,Integer> suffsum=new HashMap<>();
		for(int i:a)	totalsum+=i;
		for(int i=n-1;i>=0;i--)
		{
			sum+=a[i];
			suffsum.put(sum,suffsum.getOrDefault(sum,0)+1);
		}
		sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
			suffsum.put(totalsum,suffsum.get(totalsum)-1);
		}
//		int b[]=a;
//		for(int i=0;i<n;i++)
//		{
//			totalsum+=a[i];
//		}
//		for(int i=0;i<n;i++)
//		{
////			b[i]=a[i];
//			b[i]=0;
//			max=Math.max(solve(b),max);
//			b[i]=a[i];
//		}
//////		if(totalsum%2!=0)
//////		{
//////			System.out.println("NOT POSSIBLE");
//////			return;
//////		}
//		System.out.println(max);
	}
//	static int solve(int b[])
//	{
//		int sum=0,count=0,n=b.length,totalsum=0;
//		for(int i=0;i<n;i++)
//		{
//			totalsum+=b[i];
//		}
//		for(int i=0;i<n;i++)
//		{
//			sum+=b[i];
//			if(sum==totalsum/2)
//				count++;
//		}
//		return count/2;
//	}

}
