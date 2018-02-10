package selfcheck.ex6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Ex6Test {

    @Test
    public void performJoinFlatmap() {
        List<ArrayList<String>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList("a", "b", "c")));
        list.add(new ArrayList<>(Arrays.asList("1", "2")));

        ArrayList<String> result1 = Ex6.performJoinFlatmap(list.stream());
        result1.forEach(System.out::print);
        System.out.println();

        ArrayList<String> result2 = Ex6.performJoinReduce(list.stream());
        result2.forEach(System.out::print);
    }
}