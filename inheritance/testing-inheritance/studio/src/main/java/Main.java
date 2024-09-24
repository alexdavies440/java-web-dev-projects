public class Main {
    public static void main(String[] args) {

        String[] choices = {"apple","dog","flute","4"};
        MultipleChoice addition = new MultipleChoice("What is 2 + 2?",choices, "d");
        MultipleChoice fruit = new MultipleChoice("Which is a fruit?", choices, "a");

        System.out.println(addition.checkAnswer("d"));
        System.out.println(fruit.checkAnswer("b"));
        fruit.askMultipleChoiceQuestion();
        addition.askMultipleChoiceQuestion();
    }
}
