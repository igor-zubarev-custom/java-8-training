package selfcheck.ex2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex2Test {

    @Test
    public void uncheckTest() {
        new Thread(Ex2.uncheck(() -> {
            System.out.println("Zzz");
            Thread.sleep(1000);
        })).start();
    }
}