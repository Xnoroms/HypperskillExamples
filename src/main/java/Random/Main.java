package Random;// Posted from EduTools plugin
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt(); //seed from (incl.)
        int b = scanner.nextInt(); //seed to (incl.)
        int n = scanner.nextInt(); // random numbers from 0 to K
        int k = scanner.nextInt();
        Integer maxValue;
        Map<Integer, Integer> randomMap = new HashMap<>();
        while (a <= b) {
            List<Integer> numbers = new ArrayList<>();
            Random random = new Random(a);

            for (int i = 0; i < n; i++) {
                numbers.add(random.nextInt(k));
            }

            maxValue = Collections.max(numbers);
            randomMap.put(a, maxValue);
            a++;
        }


        Integer lowestValueOfAllRandomMap = Collections.min(randomMap.values());

        for (Map.Entry<Integer, Integer> entry : randomMap.entrySet()) {
            // loop to check and return the key with the lowest value of all random map
            if (entry.getValue().equals(lowestValueOfAllRandomMap)) {
                System.out.println(entry.getKey());
                break;
            }
        }
        System.out.println(lowestValueOfAllRandomMap);

    }
}