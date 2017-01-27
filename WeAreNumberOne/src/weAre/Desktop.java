package weAre;

import java.io.IOException;

public class Desktop implements Runnable{
    public void run() {
    	final int max = 6;
    	int p = max + 1;
    	while(true){
    		int n;
    		do n = NumberOne.r.nextInt(max - 1) + 1; while(n==p);
    		p = n;
    		System.out.println("DESKTOP: Changing in " + n);
    		try {
				NumberOne.exe("dsk.exe \"" + NumberOne.dir + "\\d" + n + ".bmp\"");
			} catch (IOException e) {
				e.printStackTrace();
			}
    		NumberOne.wait(250, true);
    	}
    }
}
