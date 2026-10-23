/*
leetcode 334 Increasing Triplet Subsequence
You are given an integer array nums.
Return true if there exists a triple
of indices (i, j, k) such that i < j < k 
and nums[i] < nums[j] < nums[k]. If no such 
indices exists, return false.
Example 1:
Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
*/
import java.util.*;
public class Increasing_triplet_subsequence
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
		System.out.println(increasingTriplet(nums));
		
	}
	public static boolean increasingTriplet(int[] nums)
	{
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;

		for(int num : nums)
		{
			if(num <= first)
			{
				first = num;
			}
			else if(num <= second)
			{
				second = num;
			}
			else
			{
				return true;
			}
		}
    return false;
	}
}