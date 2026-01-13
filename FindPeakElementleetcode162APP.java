import java.util.Scanner;
public class FindPeakElementleetcode162APP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		
		int nums[] = new int[n];
		System.out.println("Enter array Element");
		for(int i=0;i<n;i++)
		{
			nums[i] = sc.nextInt();
		}
		int  index = findPeakElement(nums);
		System.out.println(nums[index]+" is a Peak Element &  Index  is : "+index);
		
	}
	public static int findPeakElement(int nums[])
	{
		int n = nums.length;
		
		if(n == 1) return 0;
		
		//first element peak
		if(nums[0] > nums[1]) return 0;
		
		//last element peak
		if(nums[n-1] >nums[n-2]) return n-1;
		
		int start =0 ;
		int end =nums.length-1;
		
		while(start < end)
		{
			int mid = start+(end-start)/2;
			
			if(nums[mid] >nums[mid+1]){
				end = mid;
			}
			else {
				start = mid +1;
			}
		}
		return start;
	}
}
		