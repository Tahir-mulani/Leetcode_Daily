import java.util.*;
public class RemoveElementleetcode27APP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 element  in array");
		int nums[] = new int[5];
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=sc.nextInt();
		}
		
		System.out.println("Enter val to remove from Array");
		int val = sc.nextInt();
		
		int result = removeElement(nums,val);
		
		System.out.println("New Length : "+result);
		
		System.out.println("Updated Array\n");
		
		for(int i=0 ; i<result;i++)
		{
			System.out.print(nums[i]+" ");
		}
		
	}
	public static int removeElement(int nums[],int val)
	{
		int k=0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i] != val)
			{
				nums[k] = nums[i];
				k++;
			}
		}
		
		return k;
	}
}
		