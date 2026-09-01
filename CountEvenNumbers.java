import java.util.ArrayList;

public class CountEvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        int count = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                count++;
            }
        }

        System.out.println("Even numbers: " + count);
    }
}
