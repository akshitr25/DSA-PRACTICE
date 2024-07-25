import java.util.HashMap;
import java.util.Map;

public class July25 {
	public static void main(String as[]) {//25 JULY CHALLENGE
//		Element in the array can range from [-10^9……….10^9]
//Find the number of tuplets (i,j,k,l,m) such that: 
//a[i] + b[j] + c[k] + d[l] + e[m] = 0
//		a[i]+b[j] = -(c[k]+d[l]+e[m])
//		TC N^3+N^2=>N^3, SC N^2
		int a[]={2,5};
		int b[]={3,8};
		int c[]={-5,8};
		int d[]={5,10};
		int e[]={-10,100};
		int n=a.length,ans=0;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int sum=a[i]+b[j];
				map.put(sum,map.getOrDefault(sum,0)+1);
			}
		}
		for(int k=0;k<n;k++)
		{
			for(int l=0;l<n;l++)
			{
				for(int m=0;m<n;m++)
				{
					int find=-(c[k]+d[l]+e[m]);
					ans+=map.getOrDefault(find,0);
				}
			}
		}
//		System.out.println(map);
		System.out.println(ans);
	}
}
