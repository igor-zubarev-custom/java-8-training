package selfcheck.ex6;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex6 {
    public static <T> ArrayList<T> performJoinFlatmap(Stream<ArrayList<T>> source) {
        return source.flatMap(ts -> ts.stream()).collect(Collectors.toCollection(ArrayList::new));
    }

    public static <T> ArrayList<T> performJoinReduce(Stream<ArrayList<T>> source) {
        return source.reduce(new ArrayList<>() ,(ts, ts2) -> {
            ArrayList<T> list = new ArrayList<>(ts);
            list.addAll(ts2);
            return list;
        });
    }
}
