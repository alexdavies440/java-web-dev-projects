import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numArray = {1, 1, 2, 3, 5, 8};
        for (int num : numArray) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        String excerpt = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] excerptWords = excerpt.split(" ");
        System.out.println(Arrays.toString(excerptWords));

        String[] excerptSentences = excerpt.split("\\.");
        System.out.println(Arrays.toString(excerptSentences));
    }
}
