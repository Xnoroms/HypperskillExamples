package test;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> output = new LinkedHashMap<>();

        //przypisanie definicji i kluczy do poszczególnych kart

        System.out.println("Input the number of cards: ");
        int firstNum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < firstNum; i++) {
            System.out.printf("The card #%d: \n", i + 1);
            String tempKey = scanner.nextLine();
            String key = "";
            if (output.containsValue(tempKey)) {
                do {
                    System.out.printf("The card \"%s\" already exists. Try again: \n", tempKey);
                    tempKey = scanner.nextLine();
                }
                while (output.containsValue(tempKey));
                key = tempKey;
            } else {
                key = tempKey;
            }
            System.out.printf("The definition of the card #%d: \n", i + 1);
            String tempValue = scanner.nextLine();
            String value = "";
            if (output.containsKey(tempValue)) {
                do {
                    System.out.printf("\"The definition \"%s\" already exists. Try again: \n", tempValue);
                    tempValue = scanner.nextLine();
                } while (output.containsKey(tempValue));
                value = tempValue;
            } else {
                value = tempValue;
            }

            output.put(value, key);
        }
       // System.out.println(output);
        //pytania i odpowiedzi z sugestiami prawidłowych rozwiązań

        List<String> tempKeys = new ArrayList<>(output.values());
        List<String> tempValues = new ArrayList<>(output.keySet());

        for (int i = 0; i < firstNum; i++) {
            String userDefinition;
            String correctDefinition = tempValues.get(i);
            System.out.printf("Print the definition of \"%s\":\n", tempKeys.get(i));
            userDefinition = scanner.nextLine();
            if (userDefinition.equals(correctDefinition)) {
                System.out.println("Correct answer");
            } else if (tempValues.contains(userDefinition)) {
                System.out.printf("Wrong answer. The correct one is \"%s\", you've just written the definition of \"%s\". \n", correctDefinition, output.get(userDefinition));

            } else {
                System.out.printf("Wrong answer. The correct one is \"%s\"\n", correctDefinition);
            }
        }
    }
}


