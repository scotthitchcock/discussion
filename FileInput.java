import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileInput {
	private String file;  //name of the file that we are reading
	private ArrayList<String> lines;  //An arraylist that stores each line of the input file 
	
	/**
	 * Constructor that sets the passed file name equal to our
	 * private instance variable.  Also creates a new ArrayList and
	 * calls the method to read the file.
	 * @param file Name of the file to be read.
	 */
	public FileInput(String file) {
		this.file = file;
		lines = new ArrayList<>();
		readInputFile();
	}
	
	/**
	 * This Method reads the file provided by the user and stores it in an ArrayList
	 * line by line. 
	 */
	public void readInputFile() {
		
		try {
			File inputFile = new File(file);
			Scanner in = new Scanner(inputFile);
			
			while(in.hasNextLine()) {
				lines.add(in.nextLine());
			}
			in.close();
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException("File does not exist", e);
		}
	}
	
	/**
	 * This is the getter method for the lines variable.
	 * @return The arraylist of lines.
	 */
	public ArrayList<String> getLines() {
		return lines;
	}
		
}
