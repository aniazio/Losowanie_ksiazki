import java.io.*;
import java.util.Random;

public class LosowanieCzarne {

    public static void main(String args[]) {
        int lines = readHowManyLinesInFile();
        System.out.println(returnRandomLine(lines));
    }

    private static int readHowManyLinesInFile() {
        int result = 0;
        try (BufferedReader baza = new BufferedReader(new FileReader("pliki/CzarneBaza.txt"))) {
            while (baza.readLine() != null) result++;
            return result;
        } catch (IOException exc) {
            System.out.println("Błąd wejścia-wyjścia: " + exc);
        }
        return -1;
    }

    private static String returnRandomLine(int lines) {
        try (BufferedReader baza = new BufferedReader(new FileReader("pliki/CzarneBaza.txt"))) {
            Random random = new Random();
            int i = random.nextInt(lines);

            for (int j = 0; j < i; j++) baza.readLine();

            String result = baza.readLine();
            return result;
        } catch (IOException exc) {
            System.out.println("Błąd wejścia-wyjścia: " + exc);
        }
        return "";
    }
}

