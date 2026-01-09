import java.util.*;
public class MaximumCountPositiveNegativeIntgerleetcode2529APP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		
		int nums[] = new int[n];
		System.out.println("Enter Array element");
		for(int i =0 ;i<n;i++)
		{
			nums[i] = sc.nextInt();
		}
		
		System.out.println("maximumCount is : "+maximumCount(nums));
		sc.close();
	}
	public static int maximumCount(int []nums)
	{
		int positive = 0;
		int negative = 0;
		
		for(int i =0 ;i< nums.length ;i++)
		{
			if( nums[i] > 0)
			{
				positive++;
			}
			else if( nums[i] < 0)
			{
				negative++;
			}
			else{ };
		}
		
		if(positive > negative)
		{
			return positive;
		}
		else
		{
			return negative;
		}
	}		
}