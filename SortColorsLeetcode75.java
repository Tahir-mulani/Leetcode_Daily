//Dutch National Flag Algorithm
public class SortColorsLeetcode75
{
	public static void main(String x[])
	{
		int nums[] ={2,0,2,1,1,0};
		sortColors(nums);
	}
	public static void sortColors(int nums[])
	{
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