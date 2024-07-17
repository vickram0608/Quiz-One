package dto;

public class Question {
    private int id;
    private String question;
    private Option[] options;
    private char correctOption;

    public Question(int id, String question, Option[] options, char correctOption) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public Option[] getOptions() {
        return options;
    }

    public char getCorrectOption() {
        return correctOption;
    }
}
