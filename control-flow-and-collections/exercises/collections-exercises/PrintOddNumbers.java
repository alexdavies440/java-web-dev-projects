public class PrintOddNumbers {
    public static void main(String[] args) {
        int[] numArray = {1, 1, 2, 3, 5, 8};
        for (int num: numArray) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}
