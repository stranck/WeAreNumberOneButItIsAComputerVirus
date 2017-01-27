package weAre;

import java.io.IOException;

public class Video implements Runnable{
    public void run() {
    	int i = 1;
    	//System.out.print("VIDEO: Opening level " + i);
    	while(NumberOne.running){
        	System.out.println("VIDEO: Opening level " + i);
    		try {
				NumberOne.exe("start AWeAreNumberOneMemeButEvery5MinutsMoreDistorted[Level" + i + "].mp4");
			} catch (IOException e) {
				e.printStackTrace();
			}
    		if(i<4) i++;
    		NumberOne.wait(300000, true);
    	}
    }
}
