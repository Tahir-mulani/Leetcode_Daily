/*
leetcode 238 Product of Array Except Self
Given an integer array nums, return an array answer such that answer[i] is equal to 
the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
*/
import java.util.*;
public class Product_Of_Array_Except_Self
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		System.out.println("Enter array element");
		int nums[] = new int[size];
		for(int i=0;i<size;i++)
		{
			nums[i] = sc.nextInt();
		}
		int result[] = productExceptSelf(nums);
		for(int i:result)
		{
			System.out.print(i+" ");
		}
	}
	public static int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];

    // Prefix product
    int prefix = 1;

    for(int i = 0; i < n; i++)
    {
        result[i] = prefix;
        prefix = prefix * nums[i];
    }

    // Suffix product
    int suffix = 1;

    for(int i = n - 1; i >= 0; i--)
    {
        result[i] = result[i] * suffix;
        suffix = suffix * nums[i];
    }

    return result;
	}
}
/*
	public static  int[] productExceptSelf(int[] nums)
	{
		int result[] = new int[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			int prod = 1;
			for(int j=0;j<nums.length;j++)
			{
				if(nums[i] == nums[j])
					continue;
				
				prod = prod*nums[j];
			}
			result[i] = prod;
		}
		return result;
	}*/
 