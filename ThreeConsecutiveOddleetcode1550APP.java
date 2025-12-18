import java.util.*;
public class ThreeConsecutiveOddleetcode1550APP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array element");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		if(threeConsecutiveOdds(arr))
		{
			 System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	public static boolean threeConsecutiveOdds(int []arr)
	{
		boolean flag = false;
		for(int i=0;i<arr.length-2;i++)
		{
			if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0)
			{
				flag=true;
			}
			
		}
		if(flag)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
}