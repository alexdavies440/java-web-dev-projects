public class TrueFalse extends Question {

    public TrueFalse(String question, String answer) {
        super(question, answer);
    }


    public int checkAnswer(String userAnswer) {

        int result = super.getAnswer() == userAnswer ? 1 : 0;
        return result;
    }
}
