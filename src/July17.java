import java.util.HashMap;
import java.util.Map;

public class July17 {
	//BS 20 - 17 JULY OA CHALLENGE
	//We are given “n” type of items ; array b is given which tells us -> b[i] = frequency of item “i” ; 
	//Our task is to make a group of k distinct items; 
	//And finally output how many maximum such types of groups can be formed. 
//	BF TC , SC
//	to make y groups with size k, then sum of array has to be >=y*k
//	BF: keep trying from y=1 to the point until answer comes as NO.
	public static void main(String as[]) {
		int a[]={1,2,3,4},k=4,y=0;
		//1->1, 2->2, 3->3, 4->4
		int n=a.length,item=1;
		for(int i=0;i<n;i++)
		{
			
		}
		System.out.println();
	}
	static int count(int a[],int k)
	{
		int left=0,right=a.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
		}
		return 0;
	}
}
