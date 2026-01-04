import java.util.*;
public class CountPartitionsWithEvenSumDifferenceleectcode3432APP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = sc.nextInt();
		
		int nums[] = new int[size];
		System.out.println("Enter Array Element");
		for(int i = 0 ; i < size ; i++)
		{
			nums[i] = sc.nextInt();
		}
		
		int result = countPartitions(nums);
		System.out.println(result);
	}
	public static int countPartitions(int []nums)
	{
		int sum = 0;
		
		for(int i=0;i<nums.length;i++)
		{
			sum += nums[i];
		}
		
		if(sum % 2 == 0)
		{
			return nums.length - 1;
		}
		else
		{
			return 0;
		}
	}
}