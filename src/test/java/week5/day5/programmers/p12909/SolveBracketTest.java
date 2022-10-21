package week5.day5.programmers.p12909;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracketTest {

    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracket() {
        SolveBracket sb = new SolveBracket();

        assertTrue(sb.solution("()()"));
    }
}