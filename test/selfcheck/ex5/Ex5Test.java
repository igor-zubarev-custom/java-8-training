package selfcheck.ex5;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class Ex5Test {

    @Test
    public void zip() {
        Stream<String> first = Stream.of("a", "b", "c", "d");
        Stream<String> second = Stream.of("A", "B", "C");

        Stream<String> result = Ex5.zip(second, first);

        result.forEach(System.out::print);
    }
}