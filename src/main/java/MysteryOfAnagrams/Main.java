package MysteryOfAnagrams;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        String input1;
        Map<Character, Integer> characters1 = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        input1 = scanner.nextLine().toLowerCase();


        for (int i = 0; i < input1.length(); i++) {
            if (characters1.containsKey(input1.charAt(i))) {
                Integer a = characters1.get(input1.charAt(i));
                characters1.put(input1.charAt(i), a + 1);
            } else {
                characters1.put(input1.charAt(i), 1);
            }
        }

        String input2;
        Map<Character, Integer> characters2 = new HashMap<>();

        input2 = scanner.nextLine().toLowerCase();


        for (int i = 0; i < input2.length(); i++) {
            if (characters2.containsKey(input2.charAt(i))) {
                Integer a = characters2.get(input2.charAt(i));
                characters2.put(input2.charAt(i), a + 1);
            } else {
                characters2.put(input2.charAt(i), 1);
            }
        }

        if (characters2.equals(characters1)) {
            System.out.println("yes");
        } else {
            System.out.println("no");

        }
    }
}
