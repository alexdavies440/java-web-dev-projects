public abstract class Question {
    int id;
    String name;
    String question;

    public Question(String name, String question) {
        this.name = name;
        this.question = question;
    }

    public String getName() {
        return name;
    }

    public String getQuestion() {
        return question;
    }
}
