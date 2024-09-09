import java.util.ArrayList;
import java.util.Scanner;

public class SumOfEvenNumbers {
    public static int evenSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter number " + (i+1) + ": ");

            Integer item = input.nextInt();
            numList.add(item);
        }

        System.out.println("Sum of even numbers: " + evenSum(numList));
    }
}
