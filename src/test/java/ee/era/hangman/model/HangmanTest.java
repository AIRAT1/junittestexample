package ee.era.hangman.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangmanTest {
    @Test
    public void youSeeMaskedWord() {
        assertEquals("____", new Hangman("sofa").getWord());
    }
}
