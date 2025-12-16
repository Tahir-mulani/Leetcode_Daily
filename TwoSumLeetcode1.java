import java.util.*;
public class TwoSumLeetcode1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int nums[]=new int[5];
		
		System.out.println("Enter array element");
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=sc.nextInt();
		}
		
		System.out.println("Enter Target Sum");
		int target = sc.nextInt();
		
		int result[]=twoSum(nums,target);
		for(int val: result)
		{
			System.out.print(val+" ");
		}
		
	}
	public static int[] twoSum(int[] nums,int target)
	{
		int result[] = new int[2];
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;i<nums.length;i++)
			{
				if(nums[i]+nums[j]==target)
				{
					result[0] = nums[i];
					result[1] = nums[j];
				}
			}
		}
		return result;
	}
}
		