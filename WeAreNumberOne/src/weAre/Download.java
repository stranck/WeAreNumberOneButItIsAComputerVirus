package weAre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Download {
	public static String dwn(String apii) {
	boolean first = false;
	String check = null;
	URL url;
    InputStream is = null;
    BufferedReader br;
    String line;
    System.out.println("Check:  " + apii);
    try {
        url = new URL(apii);
        is = url.openStream();
        br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
        	if(!first){
        		check = line;
        		first = true;
        	} else check = check + line;
        }
    } catch (MalformedURLException mue) {
         mue.printStackTrace();
    } catch (IOException ioe) {
         ioe.printStackTrace();
    } finally {
        try {
            if (is != null) is.close();
        } catch (IOException ioe) {}
    }
    //System.out.println("Check:  " + apii);
    System.out.println(check);
    return check;
	}
}
