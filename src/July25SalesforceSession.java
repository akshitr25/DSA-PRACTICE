import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class July25SalesforceSession {
	public static void main(String as[]) {//25 JULY CHALLENGE
//		Find subset of k elements such that g is maximum; 
//		G = min possible difference b/w any two elements in the subset of k elements. 
//		TC N*logN+(N)*log(limit), SC 1
		int a[]={5,11,8},k=2,g=0,n=a.length,ans=0;
		Arrays.sort(a);
		int limit=a[n-1]-a[0];
//		for(int d=1;d<=limit;d++) //O(limit)
//		{
//			if(check(d,k,a))
//			{
//				ans+=d;
//			}
//			else
//			{
//				break;
//			}
//		}
		int low=1,high=limit-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(check(mid,k,a))
			{
				if(check(mid+1,k,a)==false)
				{
					ans=mid;
					break;
				}
				else
				{
					low=mid+1;
				}
			}
			else
			{
				high=mid-1;
			}
		}
		System.out.println(ans);
	}
	static boolean check(int d,int k,int a[])
	{
		int first=a[0],count=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]-first>=d)
			{
				count++;
				first=a[i];
			}
		}
		if(count>=k)
			return true;
		return false;
	}
}
