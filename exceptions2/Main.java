package projecta;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static Scanner s = new Scanner(System.in); 
	
	
		
	public static void main(String[] args) throws IOException  {
		
		FileWriter file = null;
		// 1 try
		// 2 everything ok 
		// 3 if error - seek catch
		//              if found then handle and continue
		//              if not found -- exception fires on ...
		// 4 finally block
	    try {
	        file = new FileWriter("filename.txt");
	        file.write("Files in Java might be tricky, but it is fun enough!");
	        // ----------
	        file.write("Files in Java might be tricky, but it is fun enough!");
	        System.out.println("Successfully wrote to the file.");
	      } 
	    catch (RuntimeException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	    }
	    finally {
	    	// will always happen!!!!!
	        if (file != null) {
	        	file.close();
	        }
	    }
	    
	    // targil:
	    // 1
	    // create an array of 4 elements
	    // enter index from the user
	    // print the array in the index given
	    // try-catch it
	    // in the catch print "index out of bound"
	    // anyway (hint: finally) -- print "done!"
	    // 2
	    // create a class called Taxi
	    // create member protected m_fuel
	    // create a method rideTaxi(float distanceInKm)
	    // the taxi rides 10 km per km
	    // if the distance is less then the fuel
	    // calculate the remaining fuel
	    // if not- more than the fuel then 
	    // throw new OutOfFuelException -- make it checked exception
	    // from main -- create a Taxi and a ride
	}

}
