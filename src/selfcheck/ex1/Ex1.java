package selfcheck.ex1;

import java.io.File;
import java.util.Arrays;

public class Ex1 {
    public static File[] sortFiles(File[] array) {
        Arrays.sort(array, (first, second) -> first.toPath().compareTo(second.toPath()));
        return array;
    }
}
