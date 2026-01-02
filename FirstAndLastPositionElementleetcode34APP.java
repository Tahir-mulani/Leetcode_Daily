import java.util.*;
public class FirstAndLastPositionElementleetcode34APP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int nums[] = {5,7,7,8,8,10};
		System.out.println("Enter Target");
		int target  = sc.nextInt();
		
		int last = lastOccurence(nums,target);
		int first = firstOccurence(nums,target);
		
		int result[] = searchRange(nums,target);
		System.out.println("First Index "+result[0]);
		System.out.println("Last Index "+result[1]);
		
	}
	public static int []searchRange(int []nums, int target)
	{
		int first = firstOccurence(nums,target);
		int last = lastOccurence(nums,target);
		
		return new int[]{first,last};
		
	}
	public static int lastOccurence(int []nums,int target)
	{
		
		int low = 0,high = nums.length-1;
		int index = -1;
		
		while( low <= high)
		{
			int mid = low + (high-low)/2;
			
			if(nums[mid] == target)
			{
				index = mid;
				high = mid -1;  //move left
			}
			else if(target>nums[mid])
			{
				low = mid +1;
			}
			else
			{
				high = mid -1;
			}
		}
		
		 return index;
	}
	public static int firstOccurence(int nums[],int target)
	{
		int low =0;
		int high = nums.length-1;
		int index = -1;
		while(low <= high)
		{
			int mid = low + (high-low)/2;
			
			if(nums[mid] == target)
			{
				index = mid;
				low = low+1; //move to right
			}
			else if(target>nums[mid])
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}
		
		return index;
	}
}