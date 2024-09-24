public class MultipleChoice extends Question {
    private String[] choiceKeys = {"a", "b", "c", "d"};
    private String[] choices = new String[4];
    private String answer;
    public MultipleChoice(String question, String[] choices, String answer) {
        super(question);
        this.choiceKeys = getChoiceKeys();
        this.choices = choices;
        this.answer = answer;
    }

    public String[] getChoiceKeys() {
        return choiceKeys;
    }

    public String getAnswer() {
        return answer;
    }

    public int checkAnswer(String userAnswer) {

        int result = answer == userAnswer ? 1 : 0;
        return result;
    }

    public void askMultipleChoiceQuestion() {
        System.out.println(this.getQuestion());
        for (int i = 0; i < choices.length; i++) {
            System.out.println("(" + choiceKeys[i] + ")" + " " + choices[i]);
        }
    }
}

