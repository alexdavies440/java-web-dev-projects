public class MultipleChoice extends Question {
    private String[] choiceKeys = {"a", "b", "c", "d"};
    private String[] choices = new String[4];
    public MultipleChoice(String question, String[] choices, String answer) {
        super(question, answer);
        this.choiceKeys = getChoiceKeys();
        this.choices = choices;
    }

    public String[] getChoiceKeys() {
        return choiceKeys;
    }

    public String getAnswer() {
        return super.getAnswer();
    }

    public int checkAnswer(String userAnswer) {

        int result = super.getAnswer() == userAnswer ? 1 : 0;
        return result;
    }

    public void askMultipleChoiceQuestion() {
        System.out.println(this.getQuestion());
        for (int i = 0; i < choices.length; i++) {
            System.out.println("(" + choiceKeys[i] + ")" + " " + choices[i]);
        }
    }
}

