import java.util.HashMap;
import java.util.Map;

public class Aug5 {
	public static void main(String[] args) {
//		The number of pairs (i,j) such that i < j but -      
//		a[i] > a[j] 
		int a[]={2,1, 3, 5,4, 7,6},n=a.length;
		int pairs=0;
//		//BF TC N^2, SC 1
//		for(int i=0;i<n;i++)
//		{
//			for(int j=i+1;j<n;j++)
//			{
//				if(a[i]>a[j])
//					pairs++;
//			}
//		}
		System.out.println(pairs);
	}

}
