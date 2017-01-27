package weAre;

import java.io.IOException;

public class Last implements Runnable{
	public void run(){
		System.out.println("LAST: starting ");
		new AePlayWave("THEREALROBBIEROTTEN.wav").start();
		int[] one = {
					 0,
				 39500,
				 45000,
				 57000,
				 77500,
				 83500,
				 91500,
				132500,
				139000,
				156500,
				162000,
				163500,
				165000,
				180500
		};
		NumberOne.wait(1000, false);
		//long start = System.currentTimeMillis();
		//System.out.println(start);
		for(int i = 1; i < one.length; i++){
			//long now = System.currentTimeMillis();
			//int n = i - (int)( start - now );
			int n = one[i] - one [i - 1];
			NumberOne.wait(n, true);
			System.out.println("LAST: " + one[i] + " (" + n + ")");
			select(i);
			//System.out.println(" done");
		}
		/*for(int i : one){
			long now;
			System.out.print("LAST: " + i);
			do{
				now = System.currentTimeMillis();
				NumberOne.wait(30, false);
			}while(i >= start - now);
			System.out.println(" done");
		}*/
	}
	public static boolean select(int i){
		System.out.println("Selecting " + i);
		switch(i){
			case 1: {new Thread(new Video()).start(); break;}
			case 2: {new Thread(new C()).start(); break;}
			case 3: {new Thread(new Site()).start(); break;}
			case 4: {new Thread(new RandomSound()).start();break;}
			case 5: {NumberOne.pay[0] = true; break;}
			case 6: {NumberOne.pay[1] = true; break;}
			case 7: {new Thread(new Crash()).start(); break;}
			case 8: {new Thread(new S()).start(); break;}
			case 9: {new Thread(new H4ck()).start(); break;}
			case 10:{new Thread(new Desktop()).start(); break;}
			case 11:{new Thread(new Printer()).start(); break;}
			case 12:{
				System.out.println("WINDOW: Opening");
				try {
					NumberOne.exe("window.exe");
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			}
			default: return false;
		}
		return true;
	}
}
