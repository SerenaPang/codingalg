package alg.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TokenizeTest {

    private final Tokenize tokenizer = new Tokenize();

    @Test
    void shouldTokenizeNormalSentence() {
        assertArrayEquals(
                new String[] { "This", "is", "a", "string" },
                tokenizer.tokenize("This is a string"));
    }

    @Test
    void shouldHandleLeadingSpaces() {
        assertArrayEquals(
                new String[] { "This", "is", "a", "string" },
                tokenizer.tokenize("   This is a string"));
    }

    @Test
    void shouldHandleTrailingSpaces() {
        assertArrayEquals(
                new String[] { "This", "is", "a", "string" },
                tokenizer.tokenize("This is a string   "));
    }

    @Test
    void shouldHandleLeadingAndTrailingSpaces() {
        assertArrayEquals(
                new String[] { "This", "is", "a", "string" },
                tokenizer.tokenize("   This is a string   "));
    }

    @Test
    void shouldHandleMultipleSpacesBetweenWords() {
        assertArrayEquals(
                new String[] { "This", "is", "a", "string" },
                tokenizer.tokenize("This    is     a   string"));
    }

    @Test
    void shouldHandleSpacesAtBeginningMiddleAndEnd() {
        assertArrayEquals(
                new String[] { "This", "is", "a", "string" },
                tokenizer.tokenize("  This   is    a   string  "));
    }

    @Test
    void shouldHandleSingleWord() {
        assertArrayEquals(
                new String[] { "Hello" },
                tokenizer.tokenize("Hello"));
    }

    @Test
    void shouldHandleSingleWordWithWhiteSpaces() {
        assertArrayEquals(
                new String[] { "Hello" },
                tokenizer.tokenize("  Hello  "));
    }

    @Test
    void shouldHandleStringContainingOnlySpaces() {
        assertArrayEquals(
                new String[] {},
                tokenizer.tokenize("     "));
    }

    @Test
    void shouldHandleEmptyString() {
        assertArrayEquals(
                new String[] {},
                tokenizer.tokenize(""));
    }

    @Test
    void shouldHandleSingleCharacterTokens() {
        assertArrayEquals(
                new String[] { "a", "b", "c" },
                tokenizer.tokenize("a b c"));
    }

    @Test
    void shouldHandleSingleCharacterToken() {
        assertArrayEquals(
                new String[] { "a" },
                tokenizer.tokenize("a"));
    }

    @Test
    void shouldTokenizeNormalSentence2() {
        assertArrayEquals(
                new String[] { "This", "is", "a", "string" },
                tokenizer.tokenizer("This is a string"));
    }

    @Test
    void shouldHandleLeadingSpaces2() {
        assertArrayEquals(
                new String[] { "This", "is", "a", "string" },
                tokenizer.tokenizer("   This is a string"));
    }

    @Test
    void shouldHandleTrailingSpaces2() {
        assertArrayEquals(
                new String[] { "This", "is", "a", "string" },
                tokenizer.tokenizer("This is a string   "));
    }

    @Test
    void shouldHandleLeadingAndTrailingSpaces2() {
        assertArrayEquals(
                new String[] { "This", "is", "a", "string" },
                tokenizer.tokenizer("   This is a string   "));
    }

    @Test
    void shouldHandleMultipleSpacesBetweenWords2() {
        assertArrayEquals(
                new String[] { "This", "is", "a", "string" },
                tokenizer.tokenizer("This    is     a   string"));
    }

    @Test
    void shouldHandleSpacesAtBeginningMiddleAndEnd2() {
        assertArrayEquals(
                new String[] { "This", "is", "a", "string" },
                tokenizer.tokenizer("  This   is    a   string  "));
    }

    @Test
    void shouldHandleSingleWord2() {
        assertArrayEquals(
                new String[] { "Hello" },
                tokenizer.tokenizer("Hello"));
    }

    @Test
    void shouldHandleSingleWordWithWhiteSpaces2() {
        assertArrayEquals(
                new String[] { "Hello" },
                tokenizer.tokenizer("  Hello  "));
    }

    @Test
    void shouldHandleStringContainingOnlySpaces2() {
        assertArrayEquals(
                new String[] {},
                tokenizer.tokenizer("     "));
    }

    @Test
    void shouldHandleEmptyString2() {
        assertArrayEquals(
                new String[] {},
                tokenizer.tokenizer(""));
    }

    @Test
    void shouldHandleSingleCharacterTokens2() {
        assertArrayEquals(
                new String[] { "a", "b", "c" },
                tokenizer.tokenizer("a b c"));
    }

    @Test
    void shouldHandleSingleCharacterToken2() {
        assertArrayEquals(
                new String[] { "a" },
                tokenizer.tokenizer("a"));
    }
}
