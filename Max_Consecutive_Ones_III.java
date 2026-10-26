/*
leetcode 1004 Max Consecutive Ones III
Given a binary array nums and an integer k, return the maximum number of 
consecutive 1's in the array if you can flip at most k 0's.
Example 1:
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
*/
import java.util.*;
public class Max_Consecutive_Ones_III
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter array element");
		int nums[] = new int[size];
		for(int i=0;i<size;i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.println("Enter K");
		int k=sc.nextInt();
		System.out.println(longestOnes(nums,k));
	}
	public static int longestOnes(int[] nums, int k) 
	{
        int left = 0,right = 0,zeroCount = 0,max = 0;
		
		while(right<nums.length)
		{
			if(nums[right] == 0)
			{
				zeroCount++;				
			}
			right++;
			while(zeroCount > k)
			{
				if(nums[left] == 0)
				{
					zeroCount--;
				}
				left++;
			}
			
			max = Math.max(max, right - left);
		}
		return max;
    }
}