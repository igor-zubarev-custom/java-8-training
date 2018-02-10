package selfcheck.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex4 {
    public static Stream<Character> characterStream(String s) {
        List<Character> result = new ArrayList<>();
        for (char c : s.toCharArray()) result.add(c);
        return result.stream();
    }
    public static Stream<Character> characterStream2(String string) {
        return string.chars().mapToObj(ch -> (char) ch);
    }
}
