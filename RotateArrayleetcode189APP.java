import java.util.*;
public class RotateArrayleetcode189APP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size array");
		int n = sc.nextInt();
		
		System.out.println("Enter Array element");
		int nums[] = new int[n];
		for(int i = 0;i<n;i++)
		{
			nums[i] = sc.nextInt();
		}
		
		System.out.println("Enter size k");
		int  k = sc.nextInt();
		
		rotate(nums,k);
		
		
	}
	public static void rotate(int [] nums,int k)
	{
		int n = nums.length;
		k = k % n;
		
		int temp[] = new int[n];
		
		for(int i = 0;i < n ;i++)
		{
			temp[(i+k) % n] = nums[i];
		}
		
		//copy back
		for(int i=0;i<n;i++)
		{
			nums[i] = temp [i];
		}
		
		for(int result : nums)
		{
			System.out.print(result+" ");
		}
	}
}
		