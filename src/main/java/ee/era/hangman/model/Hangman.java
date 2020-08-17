package ee.era.hangman.model;

import java.util.HashSet;
import java.util.Set;

public class Hangman {
    private final String word;
    private String maskedWord;
    private int failures;
    private Set<Character> usedLetters = new HashSet<>();

    public Hangman(String word) {
        this.word = word;
        maskedWord = word.replaceAll(".", "_");
    }

    public String getWord() {
        return maskedWord;
    }

    public void guessLetter(char letter) {
        int index = word.indexOf(letter);
        if (index < 0) {
            if (!usedLetters.contains(letter)) {
                failures++;
                usedLetters.add(letter);
            }
            return;
        }
        maskedWord = maskedWord.substring(0, index) + letter + maskedWord.substring(index + 1);
    }

    public boolean isLost() {
        return failures > 5;
    }

    public boolean isWon() {
        return !maskedWord.contains("_");
    }

    public int getFailuresCount() {
        return failures;
    }
}
