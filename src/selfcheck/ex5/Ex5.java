package selfcheck.ex5;

import java.util.Iterator;
import java.util.stream.Stream;

public class Ex5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterable = first.iterator();
        Iterator<T> secondIterable = second.iterator();
        Stream.Builder<T> builder = Stream.builder();

        while (firstIterable.hasNext() && secondIterable.hasNext()) {
            builder.accept(firstIterable.next());
            builder.accept(secondIterable.next());
        }

        return builder.build();
    }
}
