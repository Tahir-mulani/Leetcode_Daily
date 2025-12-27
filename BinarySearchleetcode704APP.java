import java.util.*;
public class BinarySearchleetcode704APP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int nums[] ={-1,0,3,5,9,12};
		
		System.out.println("Enter target element");
		int target = sc.nextInt();
		
		int val = search(nums,target);
		if(target == val)
		{
			System.out.println("Value found = "+val);
		}
		else
		{
			System.out.println("Value not found !");
		}		
	}
	public static int search(int []nums,int target)
	{
		int low = 0, high=nums.length-1;
		
		while(low <= high)
		{
			int mid = (low+high)/2;
			
			if(nums[mid] == target)
			{
				return mid;
			}
			else if(nums[mid] > target)
			{
				low = mid+1;
			}
			else
			{
				high = mid - 1;
			}
		}
		
		return -1;
	}
}