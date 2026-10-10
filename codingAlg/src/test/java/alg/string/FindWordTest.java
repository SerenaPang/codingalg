package alg.string;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindWordTest {
    private final FindWord finder = new FindWord();

    @Test
    void shouldReturnWordInTextIndexAndLineNumber() {
        // 0123456789101112
        String text = "hello cat\ndog cat\ncat hello";// 6 14 18
        String word = "cat";
        List<Pair<Integer, Integer>> result = finder.findWord(text, word);
        assertEquals(3, result.size());
        assertEquals(6, result.get(0).getIndex());
        assertEquals(1, result.get(0).getLine());
        assertEquals(14, result.get(1).getIndex());
        assertEquals(2, result.get(1).getLine());
        assertEquals(18, result.get(2).getIndex());
        assertEquals(3, result.get(2).getLine());
    }

    @Test
    void shouldReturnEmptyListWhenWordNotFound() {
        String text = "hello world";
        String word = "cat";
        List<Pair<Integer, Integer>> result = finder.findWord(text, word);
        assertEquals(0, result.size());
    }
}