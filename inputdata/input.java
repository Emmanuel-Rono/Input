// Java Program For BufferedReader Class
import.java.io.*;

public class BufferedReader

{

// Main Method
public static void main(String [] args)
{
	// Creating BufferedReader Object
	// InputStreamReader converts bytes to
	// stream of character
	BufferedReader BufferedReader_Name = new
	BufferedReader(new InputStreamReader(System.in));
					
	// Asking for input from user
	System.out.println("Enter String : ");
	System.out.println("Enter Integer : ");
					
	// String reading internally
	String String_name = BufferedReader_Name.readLine();
				
	// Integer reading internally
	int Integer_value =
	Integer.parseInt(BufferedReader_name.readLine());
					
	// Printing String
	System.out.println("Entered String : "+ String_name);
					
	//Printing Integer			
	System.out.println("Entered Integer : "+ Integer_value);
	
	}
					
}
