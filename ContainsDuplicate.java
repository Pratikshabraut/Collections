import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 1};

        HashSet<Integer> seen = new HashSet<>();

        boolean duplicateFound = false;

        for (int i = 0; i < numbers.length; i++) {

            if (seen.contains(numbers[i])) {
                duplicateFound = true;
                break;
            }

            seen.add(numbers[i]);
        }

        System.out.println("Duplicate found: " + duplicateFound);
    }
}
