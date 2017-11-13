package negativeageexception;

import java.util.Scanner;


/**
 * Defining Our own exception by extending Exception class to create an exception when the age is 
 * negative
 * @author Praveen
 *
 */
class NegativeAgeException extends Exception{
	
	String errorMessage;
	 
	/**
	 * Constructor of custom exception class that we pass passing while throwing the exception
	 *  to a string and then displaying that string along with the message.
	 * @param errorMessage
	 */
	public NegativeAgeException(String errorMessage)
	    {
	        this.errorMessage = errorMessage;
	    }

 
 
	
    /* (non-Javadoc)
     * Modifying toString() method to display customised error message 
     * @see java.lang.Throwable#toString()
     */
    @Override
    public String toString()
    {
        return errorMessage;
    }
}
	 
 /**
 * Demo class to use the NegativeAgeException
 * @author Praveen
 * 
 */
public class AgeExceptionDemo{	

	
 	public static void main(String[] args) {
 		
		System.out.println("Please input an age: ");
		
		Scanner scan = new Scanner(System.in); //Declaring Scanner variable to take input from user
		int age = scan.nextInt();  //Taking input from user
	
		try{
			if(age<0)
			{
				 throw new NegativeAgeException("Age cannot be negative");  //throws AgeIsNegativeException if age is negative
			} 
		}
		catch(NegativeAgeException ex)
		{
            System.out.println("Negative Age Exception: " + ex);    //Output : Exception Output: Age can not be negative
		}
	}

}
