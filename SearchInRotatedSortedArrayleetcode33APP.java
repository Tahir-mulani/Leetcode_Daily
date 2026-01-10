import java.util.*;
public class SearchInRotatedSortedArrayleetcode33APP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int nums[] = {4,5,6,7,0,1,2};
		
		System.out.println("Enter target");
		int target = sc.nextInt();
		
		int result = search(nums,target);
		if(result != -1)
		{
			System.out.println("Target index found : "+result);
		}
		else
		{
			System.out.println("Index not Found : "+result);
		}
		
		sc.close();
	}
	public static int search(int []nums,int target)
	{
		int start = 0 , end = nums.length-1;
		
		while(start <= end)
		{
			int mid = start + (end - start)/2;
			
			if(nums[mid] == target)
			{
				return mid;
			}
			
			if(nums[start] < nums[mid])
			{
				if(target >= nums[start] && target < nums[mid]){
					end  = mid - 1;
				}
				else
				{
					start = mid + 1;
				}
			}
			else
			{
				if(target <= nums[start] && target > nums[mid])
				{
					start = mid + 1;
				}
				else
				{
					end  = mid - 1;
				}
			}
		}
		return -1;
	}
}