package selfcheck.ex3;

import org.junit.Test;

public class Ex3Test {

    @Test
    public void forEachIfTest() {
        Collection2<Integer> list = new ArrayList2<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        list.forEachIf(System.out::println, x -> x % 2 == 0);
    }
}