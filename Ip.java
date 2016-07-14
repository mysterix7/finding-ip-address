import java.net.*;
import java.util.*;
class Ip
{
	public static void main(String []ar)
	{
		try
		{	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter website name ");
			String name = sc.nextLine();
			System.out.println("Ip address is:"+InetAddress.getByName(name));
		}
		catch(Exception ex)
		{
		}
	}
}


