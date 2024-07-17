package dto;

public class Option {
    private char selector;
    private String text;

    public Option(char selector, String text) {
        this.selector = selector;
        this.text = text;
    }

    public char getSelector() {
        return selector;
    }

    public String getText() {
        return text;
    }
}
