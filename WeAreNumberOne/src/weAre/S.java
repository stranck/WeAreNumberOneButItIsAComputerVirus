package weAre;

import java.io.IOException;

public class S implements Runnable{
    public void run() {
    	int i = 30000;
    	while(true){
    		System.out.println("S: " + i);
    		NumberOne.wait(i, true);
    		NumberOne.r.nextInt(30000);
    		System.out.println("S: Opening");
    		try {
				NumberOne.exe("s.exe");
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    }
}
