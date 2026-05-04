import java.util.Scanner;
public class Find_Index__Of_First_Occurrence 
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str  = sc.nextLine();
		System.out.println("Enter target String");
		String target  = sc.next();

        int index = findFirstOccurrence(str, target);
        System.out.println(index);
		
    }

    public static int findFirstOccurrence(String str, String target)
	{
		
		if(str.length() < target.length())
		{
			return -1;
		}
		/*Using String Method indexOf()
		int index = str.indexOf(target);
		return index;
		*/
		 
        for (int i = 0; i <= str.length() - target.length(); i++)
		{
            
            int j;
            for (j = 0; j < target.length(); j++)
			{
                if (str.charAt(i + j) != target.charAt(j))
				{
                    break;
                }
            }

            // if full match found
            if (j == target.length())
			{
                return i;
            }
        }
        return -1;
    }
}