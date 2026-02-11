public class LengthOfLastWordleetcode58APP
{
	public static void main(String x[])
	{
		String s = "Hello World";
		int length = lengthOfLastWord(s);
		System.out.println("Length of Last Word = "+length);
	
		
	}
	public static int lengthOfLastWord(String s)
	{
        String st[] = s.split(" ");
        return st[st.length-1].length();
    }
}