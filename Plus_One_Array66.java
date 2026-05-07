import java.util.Scanner;
import java.util.ArrayList;
public class Plus_One_Array66
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("enter array Element");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int result[] = plusOne(arr);
		for(int val:result)
		{
			System.out.print(val+" ");
		}
		
	}
	public static int[] plusOne(int digits[])
	{
		for(int i = digits.length - 1; i >= 0; i--)
		{
			if(digits[i] < 9)
			{
				digits[i]++;
				return digits;
			}

			digits[i] = 0;
		}

		int result[] = new int[digits.length + 1];
		result[0] = 1;

		return result; 
	}
}


