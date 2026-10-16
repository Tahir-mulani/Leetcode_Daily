/*
leetcode 1071
For two strings s and t, we say "t divides s" if and only 
if s = t + t + t + ... + t + t (i.e., t is concatenated 
with itself one or more times).
Given two strings str1 and str2, 
return the largest string x such that x divides both str1 and str2.
Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
*/
import java.util.*;
public class Greatest_Common_Divisor_Of_Strings
{
	public static void  main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String str1 = sc.nextLine();
		System.out.println("Enter second String");
		String str2 = sc.nextLine();
		
		System.out.println(gcdOfStrings(str1, str2));

		
		
	}
	public static String gcdOfStrings(String str1, String str2)
	{
		// Step 1: Check whether a common divisor is possible
        if (!(str1 + str2).equals(str2 + str1))
        {
            return "";
        }

        // Step 2: Find GCD of lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // Step 3: Return substring of GCD length
        return str1.substring(0, gcdLength);
    }

    public static int gcd(int a, int b)
    {
        while (b != 0)
        {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    
        
    }
}
