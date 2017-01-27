package weAre;

import java.io.IOException;

public class Crash implements Runnable{
    public void run() {
    	String[] name = {
    		"Sportacock.exe",
    		"St3ph4n13.exe",
    		"Tr1XXX13.exe",
    		"St1ngy.exe"
    	};
    	while(NumberOne.running){
    		int n = NumberOne.r.nextInt(name.length - 1);
    		System.out.println("CRASH: stopping working " + n);
    		String s = name[n];
    		try{
    			//FileO.writer(s, "stop");
    			//NumberOne.exe("stop.bat");
				NumberOne.exe(s);
			} catch (IOException e) {
				e.printStackTrace();
			}
    		NumberOne.wait(NumberOne.r.nextInt(30000) + 15000, false);
    	}
    }
}
