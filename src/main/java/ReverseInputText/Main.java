package ReverseInputText;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String inputWords = reader.readLine();

            for (int i = inputWords.length() - 1; i > -1; i--) {
                System.out.print(inputWords.charAt(i));
            }
        }
    }
}
