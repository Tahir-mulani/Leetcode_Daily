/*Given an array nums with n objects colored red, white, or blue, sort them in-place so 
that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.*/
import java.util.*;
public class SortColorsLeetcode75
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
		sortColors(nums);
	}
	public static void sortColors(int nums[])
	{
		//Dutch National Flag Algorithm
		int low=0,mid=0,high=nums.length-1;
		
		while(mid <= high)
		{
			if(nums[mid] == 0)
			{
				int temp = nums[low];
				nums[low++] = nums[mid];
				nums[mid++] = temp;
			}
			else if(nums[mid] == 1)
			{
				mid++;
			}
			else
			{
				int temp = nums[mid];
				nums[mid] = nums[high];
				nums[high--] = temp;
			}
		}
		for(int val:nums)
		{
			System.out.print(val);
		}
			
	}
}