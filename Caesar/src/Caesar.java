
import java.util.*;
public class Caesar 
{
	Scanner input = new Scanner(System.in); 
	
	protected String message;
	protected String cyper;
	protected int shift = -3;
	
	Caesar()
	{
		message = "";
		cyper = "";
		
	}
	
	Caesar(String theMessage)
	{
		theMessage = "";
	}

	public void setMessage(String theMessage)
	{
		message = theMessage;
	}
	
	public String Encrypt()
	{
		int length = message.length();
		
		
		for(int i = 0; i < length; i++)
		{
	        char letter = (char)(message.charAt(i) + shift);
	        
	        
	        if(letter > 'z')
	        {
	            cyper += (char)(message.charAt(i) - (26-shift));
	        }
	        
	        else if ((letter > 'Z')&&(letter < 'a'))
	        {
	            cyper += (char)(message.charAt(i) - (26-shift));
	        }
	        
	        else if(letter < 'A')
	        {
	        	cyper +=(char)(message.charAt(i) + (3-shift));
	        }
	        
	        else
	        {
	            cyper += (char)(message.charAt(i) + shift);
	        }
	        
	    }
	    return cyper;
		 
	}
	
}
