package weAre;

import java.io.IOException;

public class C implements Runnable{
    public void run() {
    	boolean b = true;
    	int i = NumberOne.r.nextInt(60000) + 30000;
    	while(true){
    		System.out.println("C: " + i);
    		NumberOne.wait(i, true);
    		i = NumberOne.r.nextInt(30000);
    		System.out.println("C: Opening");
    		try {
				NumberOne.exe("c.exe");
			} catch (IOException e) {
				e.printStackTrace();
			}
    		if(b){
        		System.out.println("C: Opening S thread");
    			S s = new S();
    			Thread t = new Thread(s);
    			t.start();
    			b = false;
    		}
    	}
    }
}
