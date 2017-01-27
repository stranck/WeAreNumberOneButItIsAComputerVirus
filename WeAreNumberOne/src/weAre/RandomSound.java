package weAre;

public class RandomSound implements Runnable{
    public void run() {
    	int i = NumberOne.r.nextInt(60000) + 30000;
    	while(NumberOne.running){
    		if(NumberOne.r.nextInt(5) > 1){
    			String s = String.valueOf(NumberOne.r.nextInt(22) + 1) + ".wav";
    			System.out.println("RSOUND: listening at " + s);
    			new AePlayWave(s).start();
    		} else System.out.println("RSOUND: Skipping turn");
    		int n = NumberOne.r.nextInt(64) + 1;
    		//System.out.println(n);
    		int x = NumberOne.r.nextInt(i/n/2);
    		i -=  x + (i/n/2);
    		if(i<500) i = 1000;
    		System.out.println("RSOUND: " + i + "(" + n + ";" + x + ")");
    		NumberOne.wait(i, false);
    	}
    }
}		