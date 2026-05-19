/*Given a string columnTitle that represents the column title as appears in an Excel sheet,
return its corresponding column number.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
Example 1:
Input: columnTitle = "A"
Output: 1
Example 2:
Input: columnTitle = "AB"
Output: 28
Example 3:
Input: columnTitle = "ZY"
Output: 701*/
import java.util.*;
public class ExcelSheetColumnNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String in Upper Case");
		String columnTitle = sc.next();
		
		int result = titleToNumber(columnTitle);
		
		System.out.println(result);	
	}	
    public static int titleToNumber(String columnTitle)
	{
        
         int result=0;

         for(int i=0;i<columnTitle.length();i++)
         {
            char ch = columnTitle.charAt(i);
            int val = ch - 'A' + 1;

            result = result * 26 + val;
         }

         return result;
    }
}