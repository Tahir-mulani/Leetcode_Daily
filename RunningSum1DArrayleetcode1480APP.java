public class RunningSum1DArrayleetcode1480APP
{
	public static void main(String x[])
	{
		int nums[] = {1,2,3,4};
		System.out.println("Given Array");
		for(int i:nums)
		{
			System.out.print(i+" ");
		}	
		
		int result[] = runningSum(nums);
		System.out.println("\nRunning Sum");
		for(int i:result)
		{
			System.out.print(i+" ");
		}
	}
	public static int [] runningSum(int nums[])
	{
		int a[] = new int[nums.length];
		
		a[0] = nums[0];
		
		for(int i=1;i<nums.length;i++)
		{
			a[i] = a[i-1] + nums[i];
		}
		return a;
	}
}