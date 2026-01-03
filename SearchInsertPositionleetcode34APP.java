import java.util.*;
public class SearchInsertPositionleetcode34APP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int nums[] = {1,3,5,6};
		
		System.out.println("Enter Target");
		int target = sc.nextInt();
		
		int result = searchInsert(nums,target);
		System.out.println(result);
	}
	public static int searchInsert(int []nums,int target)
	{
		int low = 0;
		int high = nums.length-1;
		
		while(low <= high)
		{
			int mid = low+(high-low)/2;
			
			if(nums[mid] == target)
			{
				return mid;
			}
			else if(target > nums[mid])
			{
				low = mid + 1;
			}
			else{
				high = mid -1;
			}
		}
		return low;
	}
}

			
	