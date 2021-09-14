package thanveer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Filecreation {
public static void main(String[] args) {
	FileInputStream fos=null;
	try {
		fos=new FileInputStream("C:\\Users\\Thanveer Ram\\eclipse-workspace\\thanveer\\Thanveer\\src\\thanveer\\Filecreation.java");
	    int i;
	    while((i=fos.read()!=-1))
	    {
	    	System.out.print((char)i);
	    	
	    }
	    catch(FileNotFoundException e) {
	    	e.printStackTrace();
	    }
	    finally {
	    	fos.close();
	    }
	}
}
}
