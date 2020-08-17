package ee.era.hangman.model;

public class Hangman {
    private final String word;

    public Hangman(String word) {
        this.word = word;
    }

    public String getWord() {
        return "____";
    }
}
