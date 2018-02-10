package selfcheck.ex4;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex4Test {

    @Test
    public void characterStreamTest() {
        Ex4.characterStream("String1").forEach(System.out::print);
        System.out.println();
        Ex4.characterStream2("String2").forEach(System.out::print);
    }
}