package MoveTheFirstNCharacters;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Integer inputNumber = scanner.nextInt();

        if (inputNumber < input.length()) {
            System.out.print(input.substring(inputNumber));
            System.out.print(input.substring(0, inputNumber));
        }
        else {
            System.out.println(input);
        }
    }
}

