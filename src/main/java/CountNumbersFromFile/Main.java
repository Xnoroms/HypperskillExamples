package CountNumbersFromFile;
// Posted from EduTools plugin
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int wordCounter = 0;
            boolean isSpace = true;
            int number = reader.read();
            while (number != 10 && number != -1) {
                if (isSpace && number != 32) {
                    wordCounter++;
                    isSpace = false;
                } else if (!isSpace && number == 32) {
                    isSpace = true;
                }
                number = reader.read();
            }
            System.out.println(wordCounter);
        }
    }
}*/

import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.io.Reader;
        import java.util.ArrayList;
        import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String inputWords = reader.readLine();


            //word counting loop

            if (inputWords == null || inputWords.isEmpty()) {
                System.out.println(0); }
            StringTokenizer tokens = new StringTokenizer(inputWords);
            System.out.println(tokens.countTokens());
        }
        }
    }







