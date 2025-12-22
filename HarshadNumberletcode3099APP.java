import java.util.*;
public class HarshadNumberletcode3099APP
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int x = sc.nextInt();
		int result =sumOfTheDigitsOfHarshadNumber(x);
		if(result != -1)
		{
			System.out.println("Number is Harshad Number");
		}
		else
		{
			System.out.println("Number is not Harshad Number");
		}
		
		
		
	}
	public static int sumOfTheDigitsOfHarshadNumber(int x)
	{
		int sum = 0;
		int temp = x;
		
		while(temp > 0)
		{	
			int digit = temp% 10;
			sum = sum + digit;
			temp = temp/10;
		}
		
		if(x % sum == 0)
		{
			return sum;
		}
		else
		{
			return -1;
		}
	}
}