import java.util.*;
public class ArraySumDivisiblebyKleetcode3512APP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int nums[] ={3,9,7}; 
		System.out.println("Enter Value of K");
		int k = sc.nextInt();
		int result = minOperations(nums,k);
		System.out.println(result);
	}
	public static int minOperations(int nums[],int k)
	{
		int sum = 0;
		
		for(int i=0;i<nums.length;i++)
		{
			sum += nums[i];
		}
		
		return sum%k;
	}
}