public class SingleNumberleetcode136APP
{
	public static void main(String x[])
	{
		int nums[] = {4,1,2,1,2};
		int result = singleNumber(nums);
		System.out.println("given array single number is : "+result);
		
	}
	public static int singleNumber(int[] nums)
	{
		int cnt = 0;
		
		for(int num : nums)
		{
			cnt = cnt^num;
		}
		
		return cnt;
	}
}