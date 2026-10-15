/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by 
deleting some (can be none) of the characters without disturbing the relative positions 
of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
*/
import java.util.Scanner;
public class SubsequenceLeetcode392
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String s = sc.nextLine();
		System.out.println("Enter Second String");
		String t = sc.nextLine();
		
		if(isSubsequence(s,t))
		{
			System.out.println(t+" is subsequence of "+s);
		} else{
			System.out.println(t+" is not subsequence of "+s);
		}
	}
	public static boolean isSubsequence(String s, String t)
	{
		int i=0;
		int j=0;
		String result="";
		while(i < s.length() && j<t.length())
		{
			if(s.charAt(i) == t.charAt(j))
			{
				result += s.charAt(i);
				i++;
			}
			j++;
		}
		
		if(result.equals(s)){
			return true;
		} else{
			return false;
		}
	}		
}
