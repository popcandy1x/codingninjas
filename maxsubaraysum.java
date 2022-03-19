import java.util.Scanner;

public class maxsubaraysum{
	public static void main(String[] args) {
		Scanner xcn=new Scanner(System.in);
		int n=xcn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=xcn.nextInt();
		}
		System.out.println(maxSubarraySum(a,a.length));
		xcn.close();
	}
	public static long maxSubarraySum(int[] arr,int n){
		long sum=arr[0],max=0;
		for(int i=1;i<arr.length;i++)
		{
			sum=Math.max(arr[i],sum+arr[i]);
			if(sum>max)
			{
				max=sum;
			}
		}
		return max;
	}
}