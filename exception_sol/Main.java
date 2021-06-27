package projecta;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static Scanner s = new Scanner(System.in); 
	
	private static void printFileDetails(String file_name) throws FileNotFoundException {
		  File file = new File(file_name);
		    if (file.exists()) {
		        System.out.println("File name: " + file.getName());
		        System.out.println("Absolute path: " + file.getAbsolutePath());
		        System.out.println("Writeable: " + file.canWrite());
		        System.out.println("Readable " + file.canRead());
		        System.out.println("File size in bytes " + file.length());
		    }
		    else {
		    	throw new FileNotFoundException("".format("file %s does not exist", file_name));
		    	//throw new NullPointerException(); // does not require declaration!
		    }
	}
	
	private static void printFile(String file_name) throws FileNotFoundException {
		
		File file = new File(file_name);
		
	      Scanner myReader = new Scanner(file);
	      
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      
	      myReader.close();
	}
	
	private static void getFileAndPrint() throws FileNotFoundException {
		System.out.println("enter file full name");
		String file_name = s.next();
		printFileDetails(file_name);
	}
	
	public static void createFile1(String file_name) {
		File file = new File(file_name);
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public static void createFile2(String file_name) throws IOException {
		File file = new File(file_name);
		file.createNewFile(); 
	}
	
	public static void main(String[] args) throws IOException {
		
		//printFile("D:\\eclipse_projects\\proj3\\src\\proj3\\Circle.java");
		
		printFileDetails("D:\\eclipse_projects\\proj3\\src\\proj3\\Circle.java");
		
		getFileAndPrint();
		
		createFile2("c:\\temp\\2.txt");
		
		// create a function called createFile1
		// get a file name from user
		// create a file with this name 
		//   hint: File file = new File("filename.txt");
	    //        file.createNewFile() -- will create file if does not exist
		// which exception  may be thrown ?
		// use try-catch to "shut-down" the error
		
		// create a function called createFile2
		// get a file name from user
		// create a file with this name 
		//   hint: File file = new File("filename.txt");
	    //        file.createNewFile() -- will create file if not exist
		// use declaration to "shut-down" the error [also in-main]
		
		
		// * etgar
		// create a function called writeUsernameAndPassword
		// get the user name (scanner read string)
		// get the user password (scanner read string)
		// create a file called "password.txt" and write the user-name and pwd
		// hint:
           FileWriter myWriter = new FileWriter("c:\\temp\\1.txt"); // IO exception
	       myWriter.write("......");
	       myWriter.close();
		// try-catch the exception
	}

}
