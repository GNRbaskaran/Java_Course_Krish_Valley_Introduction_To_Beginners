package Java_File_Handling;

import java.io.*; //java.io to use reader, writer class for files
public class fileHandling {

	public static void main(String[] args) throws IOException{ //the read() may throw IOException
		// TODO Auto-generated method stub
    FileInputStream fileIn = null; //Initially fileReader points to null
    FileOutputStream fileOut = null;
    
    try {
    	fileIn = new FileInputStream("sample.txt");
    	fileOut = new FileOutputStream("SampleCopy.txt"); //create another file to copy the same file
    	
    	int c;
    	while((c = fileIn.read()) != -1) {
    		fileOut.write((char) c); //write all character one by one from sample.txt
    	}
    	System.out.println("Writing of SampleCopy.txt is complete");
    } 
    catch(FileNotFoundException e) { //when file not exist it throws exception
    	System.out.println("Invalid File-Name");
    }
    finally { //always check whether fileIn and fileOut are null or not, if not close the file
    	if(fileIn != null) {
    		fileIn.close();
    	}
    	if(fileOut != null) {
    		fileOut.close();
    	}
    }
	}

}
