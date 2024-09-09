import java.util.Arrays;

public class ExcerptWords {
    public static void main(String[] args) {
        String excerpt = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] excerptWords = excerpt.split(" ");
        System.out.println(Arrays.toString(excerptWords));
    }
}
