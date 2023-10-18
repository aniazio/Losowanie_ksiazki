import java.net.*;
import java.io.*;

public class TworzenieBazyWydawnictwaCzarne {

    public static void main(String args[])
            throws Exception {

        URL site = new URL("https://czarne.com.pl/katalog/serie/reportaz");

        try(BufferedReader in = new BufferedReader(new InputStreamReader(site.openStream()));
                FileWriter out = new FileWriter("pliki/CzarneBaza.txt")) {

            String str=in.readLine();
            String s1;

            while (str != null){
                s1 = str.substring(0, Math.min(37, str.length()));
                    if (s1.equals("<div class='product-thumbnail-title'>")) {
                        s1 = str.substring(37, (str.length() - 6));
                        out.write(s1 + "\n");
                    }
                    str = in.readLine();
                }
        } catch(Exception exc)
        {
            System.out.println("Błąd: " + exc);
        }
    }
}
