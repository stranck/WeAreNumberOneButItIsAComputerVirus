package weAre;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class FileO {
	public static boolean writer(String text, String path){
    	try {
			File file = new File(path);
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(text); 	
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return true;
    }
    public static String reader(String path) throws IOException{
        FileReader fileReader;
        fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader( fileReader );
        String line = bufferedReader.readLine();
        bufferedReader.close();
        return line;
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
    public static boolean exist(String path){
    	File f = new File(path);
    	if(f.exists() && !f.isDirectory()) return true;
    	return false;
    }
	public static void delater(String path){
		try {
		    Files.delete(Paths.get(path));
		} catch (NoSuchFileException x) {
		    System.err.format("%s: no such" + " file or directory%n", path);
		} catch (DirectoryNotEmptyException x) {
		    System.err.format("%s not empty%n", path);
		} catch (IOException x) {
		    System.err.println(x);
		}
	}
    public static int addWrite(String path, String text) throws IOException{
		int i = 0;
		File fout = new File("temp");
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			FileOutputStream fos = new FileOutputStream(fout);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		    String line;
		    while ((line = br.readLine()) != null) {
		    	i++;
		    	bw.write(line);
		    	bw.newLine();
		    }
		    bw.write(text);
		    i++;
			bw.close();
		}
		delater(path);
		fout.renameTo(new File(path));
		return i;
	}
    public static void rename(String old, String name){
    	File f = new File(old);
		f.renameTo(new File(name));
    }
}
