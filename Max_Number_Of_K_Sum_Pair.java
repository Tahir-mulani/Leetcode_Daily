/*
leetcode 1679 Max Number of K-Sum Pair
You are given an integer array nums and an integer k.
In one operation, you can pick two numbers from the 
array whose sum equals k and remove them from the array.
Return the maximum number of operations you can perform on the array.
Example 1:
Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.
*/
import java.util.*;
public class Max_Number_Of_K_Sum_Pair
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
		int result = maxOperations(nums,k);
		System.out.println(result);
	}
	public static int maxOperations(int[] nums, int k)
	{
		 HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for (int num : nums) {

            int need = k - num;

            if (map.containsKey(need) && map.get(need) > 0) {

                count++;

                map.put(need, map.get(need) - 1);

            } else {

                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return count;
	}
}