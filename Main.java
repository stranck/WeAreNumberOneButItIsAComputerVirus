package fc;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args){
		if(args.length > 0) newFile(args[0]);
	}
	public static void newFile(String path){
    	File file = new File(path);
        try{
          file.createNewFile();
        }
        catch(IOException ioe){
        	System.out.println("Error while creating a new empty file :" + ioe);
        }
    }
}
