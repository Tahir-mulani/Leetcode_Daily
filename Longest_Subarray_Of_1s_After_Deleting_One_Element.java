/*
leetcode 1493 Longest Subarray Of 1s After Deleting One Element
You are given a binary array nums, you should delete one element from it.
Return the size of the longest non-empty subarray containing only 1's in
the resulting array. Return 0 if there is no such subarray.
Example 1:
Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] 
contains 3 numbers with value of 1's.
*/
import java.util.*;
public class Longest_Subarray_Of_1s_After_Deleting_One_Element
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter binary array element");
		int nums[] = new int[size];
		for(int i=0;i<size;i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.println(longestSubarray(nums));
	}
	public static int longestSubarray(int[] nums)
	{
		int left = 0;
		int zeroCount = 0;
		int max = 0;

		for(int right = 0; right < nums.length; right++)
		{
			if(nums[right] == 0)
			{
				zeroCount++;
			}
			while(zeroCount > 1)
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