/*Given an unsorted array of integers nums, return the length of 
the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.
Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements 
sequence is [1, 2, 3, 4]. Therefore its length is 4.*/
import java.util.*;
public class LongestConsecutiveElements
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		System.out.println("Enter element");
		int nums[] = new int[size];
		for(int i=0;i<size;i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.println(longestConsecutive(nums));
	}
	public static int longestConsecutive(int[] nums)
	{
		if(nums.length == 0)
        {
            return 0;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for(int val:nums)
        {
            set.add(val);
        }

        int longest = 1;
        int current = 1;
        Integer prev = null;

        for(int num:set)
        {
            if(prev != null)
            {
                //consecutive number found
                if(num == prev +1)
                {
                    current++;
                }
                else
                {
                    //reset counter
                    current = 1;
                }
            }
            //checking max
            if(current > longest)
            {
                longest = current;
            }
            prev = num;
        }
        return longest;
	}
}