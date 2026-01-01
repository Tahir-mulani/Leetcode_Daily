import java.util.*;
public class MajorityElementleetcode169APP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		int nums[] = new int[n];;
		System.out.println("Enter Array Element");
		for(int i=0;i<n;i++)
		{
			nums[i] = sc.nextInt();
		}
			
		
		int result = majorityElement(nums);
		if(result != -1)
		{
			System.out.println("Majority Element is : "+result);
		}
		else
		{
			System.out.println("There is no majority Element in given array");
		}
		
	}
	public static int majorityElement(int nums[])
	{
		//using --> Boyer–Moore Majority Vote Algorithm <--
		
		//find the candidate
		int candidate = 0;		
		int vote = 0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(vote == 0)
			{
				candidate = nums[i];
				vote = 1;
			}
			else if(nums[i] == candidate)
			{
				vote++;
			}
			else
			{
				vote--;
			}
		}
		
		//verify candidate
		int cnt = 0;
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(nums[i] == candidate)
			{
				cnt++;
			}
		}
		
		if(cnt > nums.length/2)
			return candidate;		
			
		
		return -1; //no majority Element
	}
}
		