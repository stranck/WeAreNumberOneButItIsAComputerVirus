package weAre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Printer implements Runnable{
	//for make the ascii "art" in the file I used this sites:
	//http://www.asciiworld.com/-Hearts-.html
	//http://www.glassgiant.com/ascii/
	//http://www.network-science.de/ascii/
	public void run(){
		while(NumberOne.running){
			System.out.println("PRINT: printing...");
			try {
				NumberOne.exe("start /min notepad.exe /p " + NumberOne.dir + "\\" + "rr.god");
			} catch (IOException e) {
				e.printStackTrace();
			}
			NumberOne.wait(NumberOne.r.nextInt(15000) + 10000, false);
		}
	}
	
	
	//'cuz i have some problem with print using "print" all this is now completely useless
    public void printAllPrinter() {
    	String prL = null;
    	do{ 
    		try {
				prL = getPrinter();
			} catch (IOException e) {
				e.printStackTrace();
			}
    		NumberOne.wait(1000, false);
    	}while(prL == null);
    	System.out.println("PRINTER: " + prL);
		String[] printerList = parsePrinter(prL);
		for(String s : printerList) System.out.println("PRINTER: List " + s);
	}
	public static String[] parsePrinter(String printerList){
		String[] list = printerList.split(";");
		String[] ret = new String[list.length];
		for(int i = 0; i < list.length; i++){
			String[] printer = list[i].split("=");
			ret[i] = printer[1];
		}
		return ret;
	}
	public static String getPrinter() throws IOException{
		Process proc = Runtime.getRuntime().exec("wmic.exe printer get name /value");
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
		String ret = "";
		System.out.println("PRINTER: Getting printer output");
		String s = null;
		while ((s = stdInput.readLine()) != null) if(s.split("=").length != 1) ret += s + ";"; // read the output from the command
		while ((s = stdError.readLine()) != null) if(s.split("=").length != 1) ret += s + ";"; // read any errors from the attempted command
		return ret.substring(0, ret.length() - 1);
	}
}
