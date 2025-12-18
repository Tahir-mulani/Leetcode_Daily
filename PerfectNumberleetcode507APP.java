import java.util.*;
public class PerfectNumberleetcode507APP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		if(checkPerfectNumber(num))
		{
			System.out.println("Number is Perfect");
		}
		else
		{
			System.out.println("Number is not Perfect");
		}
	}
	public static boolean checkPerfectNumber(int num)
	{
		int sum = 0;
		
		for(int i=1; i<num;i++)
		{
			if(num % i == 0)
			{
				sum = sum + i;
			}
		}
		
		if(sum== num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}