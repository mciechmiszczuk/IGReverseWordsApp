import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class ReverseEachWordsLetteringTest {

    private String enterWord = "word";
    private String reverseSentence = "drow";

    @Test
    public void shouldGetNotNullIfSentenceIsNotNull() {
        assertNotNull("should not be null", enterWord);
    }

    @Test
    public void shouldGetTrueIfIsAnySplitsBetweenWordsInSentence() {
        (enterWord).split(enterWord);
    }

    @Test
    public void shouldGetNotNullIfReveerseSentenceIsNotNull() {
        assertNotNull("reverse Sentence should not be null", reverseSentence);
    }

    @Test
    public void testReverseEachWordsLetteringSwap()

    {
        assertNotEquals(ReverseEachWordsLettering.reverseEachWordsLetteringSwap ("drow"), "word");

        assertNotEquals(ReverseEachWordsLettering.reverseEachWordsLetteringSwap("droo"), "word");

        assertNotEquals(ReverseEachWordsLettering.reverseEachWordsLetteringSwap(""), "");
    }

}