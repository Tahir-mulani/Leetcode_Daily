import java.util.*;
public class Palindromeleetcode9APP
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int x = sc.nextInt();
		
		boolean flag = isPalindrome(x);
		
		if(flag)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}
	public static boolean isPalindrome(int x)
	{
		int rev = 0;
		int temp = x;
		
		if(x<0)
		{
			return false;
		}
		
		while(x!=0)
		{
			int rem = x % 10;
			rev = rev * 10 + rem;
			x = x/10;
		}
		
		if(rev == temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}