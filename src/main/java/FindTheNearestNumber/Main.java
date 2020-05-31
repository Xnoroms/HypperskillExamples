package FindTheNearestNumber;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        List<Integer> tempResult = new ArrayList<>();
        List<Integer> finalResult = new ArrayList<>();

        Integer n;
        Integer difference;
        Integer finalDifference;

// add all elements to array
        while (scanner.hasNextInt())
            inputList.add(scanner.nextInt());

// last element- to n

        n = inputList.get(inputList.size()-1);


        inputList.remove(inputList.size()-1);

//find all diferences and save in array result

        for (int a: inputList
        ) {
            difference= Math.abs(a)-n;
            result.add(Math.abs(difference));
        }
        tempResult.addAll(result);
        Collections.sort(tempResult);

//first element in sorted array- it's difference

        finalDifference = tempResult.get(0);

//find nearest Integers

        for (int b: inputList
        ) {
            if (Math.abs(b-n)==finalDifference){
                finalResult.add(b);
            }
        }

// sort&print

        Collections.sort(finalResult);
        for (int c: finalResult
        ) {
            System.out.print(c+" ");
        }

    }

}