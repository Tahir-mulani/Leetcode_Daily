import java.util.*;
public class RemoveDuplicateleetcode26APP
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[6];
		System.out.println("Enter array element");
		for(int  i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		
		int k = removeDuplicate(nums);
		
		System.out.println("Array after removing duplicates");
		for(int i = 0; i < k; i++)
		{
			System.out.print(nums[i]+" ");
		}
	}
	public static int removeDuplicate(int [] nums)
	{
		int count=1 , k=1;
		
		for(int i = 1; i < nums.length; i++)
		{
			if(nums[i] != nums[i-1])
			{
				nums[k] = nums[i];
				k++;
			}
		
		}
		return k;
	}
}