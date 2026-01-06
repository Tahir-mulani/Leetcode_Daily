import java.util.*;
public class MoveZeroesleetcode283APP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int n = sc.nextInt();
		
		int nums[] = new  int[n];
		System.out.println("Enter array Element with give zero");
		for(int i=0; i< n;i++)
		{
			nums[i] = sc.nextInt();
		}
		moveZeroes(nums);
	}
	public static void moveZeroes(int [] nums)
	{
		int j=0,temp;
		
		for(int i=0;i<nums.length;i++)
		{
			//find zero in array
			if(nums[i] != 0)
			{
				temp = nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
				j++;
			}
		}
		System.out.println("After Moving Zeroes to end");
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]+" ");
		}
	}
}
			