package weAre;

import java.io.IOException;

public class Site implements Runnable{
    public void run() {
    	while(NumberOne.running){
    		if(NumberOne.r.nextBoolean()){
    			try {
    				int i = NumberOne.r.nextInt(NumberOne.meme.length);
    				System.out.println("SITE: Opening " + i);
					NumberOne.exe("start " + NumberOne.meme[i]);
				} catch (IOException e) {
					e.printStackTrace();
				}
    		} else System.out.println("SITE: Skipping turn");
    		int i = NumberOne.r.nextInt(60000);
    		System.out.println("SITE: " + i);
    		NumberOne.wait(i, false);
    	}
    }
}
