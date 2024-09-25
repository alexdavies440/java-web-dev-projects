public class Main {
    public static void main(String[] args) {

        String[] choices = {"apple","dog","flute","4"};
        MultipleChoice addition = new MultipleChoice("What is 2 + 2?", choices, "d");
        MultipleChoice fruit = new MultipleChoice("Which is a fruit?", choices, "a");

        System.out.println(addition.checkAnswer("d"));
        System.out.println(fruit.checkAnswer("b"));
        fruit.askMultipleChoiceQuestion();
        addition.askMultipleChoiceQuestion();

        TrueFalse twoPlusTwo = new TrueFalse("2 + 2 = 79. True(T) or false(F) lol?", "f");

        System.out.println(twoPlusTwo.checkAnswer("F"));
        for (String i : addition.getChoiceKeys()) {
            System.out.println(i);
        }
        String[] answers = {"flute", "4"};
        Checkbox testCheckBox = new Checkbox("which start with letter F?", choices, answers);

        System.out.println(testCheckBox.checkAnswers(answers));
    }
}
