package weAre;

import java.io.IOException;

public class C implements Runnable{
    public void run() {
    	//boolean b = true;
    	int i = NumberOne.r.nextInt(60000) + 30000;
    	while(NumberOne.running){
    		System.out.println("C: " + i);
    		System.out.println("C: Opening");
    		try {
				NumberOne.exe("c.exe");
			} catch (IOException e) {
				e.printStackTrace();
			}
    		NumberOne.wait(i, true);
    		i = NumberOne.r.nextInt(30000);
    		//if(b){
        		//System.out.println("C: Opening S thread");
        		//new Thread(new S()).start();
    			//b = false;
    		//}
    	}
    }
}
