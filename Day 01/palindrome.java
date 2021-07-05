package jpmorgan.banking.withdraw;
import java.util.*;

public class palindrome {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ss="";
		int flag=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			ss=ss+(s.charAt(i));
			
			if (s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				flag=1;
			}
		}
		//System.out.println(ss);
		
		
		if(s.equalsIgnoreCase(ss))
		{
			try
			{
				int i=Integer.parseInt(ss);
				
				System.out.println(i+"Integer and palindrome");
			}
			catch(Exception e)
			{
				if(flag==1)
				{
					System.out.println("String+Integer and palindrome");
				}
				else
				{
					System.out.println("String and palindrome");
				}
			}
		}
		else
		{
			System.out.println("Not palindrome");
		}
		sc.close();
	}

}