package weAre;

import java.io.IOException;

public class H4ck implements Runnable{
    public void run() {
    	String[] cmd = {
    		"tree C:\\",
    		"systeminfo",
    		"ping www.google.it",
    		"ipconfig",
    		"tree /F",
    		"tree /F /A"
    	};
    	while(NumberOne.running){
    		int n = NumberOne.r.nextInt(cmd.length - 1);
    		System.out.println("H4CK: omg h4ck1ng w/" + n);
    		FileO.writer(cmd[n], "h4ck");
    		try {
				NumberOne.exe("h4ck.vbs");
			} catch (IOException e) {
				e.printStackTrace();
			}
    		NumberOne.wait(NumberOne.r.nextInt(30000) + 15000, false);
    	}
    }
}
