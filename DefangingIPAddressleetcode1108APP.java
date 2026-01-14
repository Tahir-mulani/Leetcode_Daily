public class DefangingIPAddressleetcode1108APP
{
	public static void main(String x[])
	{
		/*
		Given a valid (IPv4) IP address, return a defanged version of that IP address.
		A defanged IP address replaces every period "." with "[.]".
		*/
		String address = "1.1.1.1";
		
		String result = defangIPaddr(address);
		
		System.out.println("Before "+address+" After "+result);
		
	}
	public static String defangIPaddr(String address)
	{
		return address.replace(".","[.]");
	}
}