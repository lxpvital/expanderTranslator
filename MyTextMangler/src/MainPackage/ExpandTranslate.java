package MainPackage;

import java.io.*;
import java.util.Scanner;

public class ExpandTranslate {
	
	public static void main(String[] args) {
		
		String fname = "/Users/lxp/eclipse-workspace/Expander/data/myInputFile.txt"; 
		
		File f = new File(fname); 
		
	    System.out.println(Messages.getString("HelloWorld3")); //$NON-NLS-1$
	    String myString = Messages.getString("John"); //$NON-NLS-1$
		System.out.println(myString);
		System.out.println("File name :"+f.getName());  
        System.out.println("Path:"+f.getPath());  
        System.out.println("Absolute path:"+f.getAbsolutePath()); 
        System.out.println("Parent:"+f.getParent());  
        System.out.println("Exists :"+f.exists());   
   /*    if(f.exists()) 
        { 
            System.out.println("Is writeable: "+f.canWrite()); 
            System.out.println("Is readable: "+f.canRead()); 
            System.out.println("Is a directory: "+f.isDirectory()); 
            System.out.println("File Size in bytes "+f.length()); 
            
        } 
        try {
	        Scanner input = new Scanner(f);
	        int lineCount = 0;
	        while (input.hasNextLine() & lineCount < 5000 ) {
	            String line = input.nextLine();
	            System.out.println(line);
	            lineCount++;
	        }
	        input.close();
		} catch (Exception ex) {
	        ex.printStackTrace();
	    } */
	}

}
