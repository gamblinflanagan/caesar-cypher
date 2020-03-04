
import java.util.*;
import java.util.Scanner;
public class CaesarMain 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		Scanner user_input = new Scanner( System.in );
		
		String theMessage = "";
		
		Caesar theCaesarCypher = new Caesar();
		
		System.out.println("Caesar Cypher\n");
		System.out.print("Enter a message to cypher: ");
	     
		theCaesarCypher.setMessage(theMessage = input.nextLine());
		
	       
	     System.out.print("You entered: ");
	     
	     System.out.println(theCaesarCypher.Encrypt());
	    
	}
	
	
}
