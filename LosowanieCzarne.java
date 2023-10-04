import java.io.*;
import java.util.Random;


public class LosowanieCzarne {

    public static void main(String args[]) {

        int lines = 0;

        try (BufferedReader in = new BufferedReader(new FileReader("out/production/pliki/CzarneBaza.txt"))) {


            while (in.readLine() != null) lines++;
        } catch (IOException exc) {
            System.out.println("Błąd wejścia-wyjścia: " + exc);
        }


        try (BufferedReader in = new BufferedReader(new FileReader("out/production/pliki/CzarneBaza.txt"))) {


            Random random = new Random();
            int i = random.nextInt(lines);
            //System.out.println(lines);
            //System.out.println(i);

            for (int j = 0; j < i; j++) {
                in.readLine();
            }

            String str = in.readLine();
            System.out.println(str);

        } catch (IOException exc) {
            System.out.println("Błąd wejścia-wyjścia: " + exc);
        }

    }
}

