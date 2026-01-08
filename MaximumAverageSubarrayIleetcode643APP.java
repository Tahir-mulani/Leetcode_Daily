import java.util.*;
public class MaximumAverageSubarrayIleetcode643APP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		
		int nums[] = new int[n];
		System.out.println("Enter array element");
		for(int i=0;i<n;i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.println("Enter K");
		int k =sc.nextInt();
		double result = findMaxAverage(nums,k);
		System.out.println("Maximum Average "+result);
	}
	public static double findMaxAverage(int nums[],int k)
	{
		int n = nums.length;
		
		
		double sum =0;
		
		for(int i =0;i<k;i++)
		{
			sum += nums[i];
		}
		double max = sum/k;
		
		for(int i=k;i<n;i++)
		{
			sum += nums[i] - nums[i-k];
			
			//average logic
			if((sum/k) > max)
			{
				max = sum/k;
			}
		}
		return max;
	}
}
		
		
		