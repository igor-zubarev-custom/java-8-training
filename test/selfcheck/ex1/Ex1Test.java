package selfcheck.ex1;

import org.junit.Test;

import java.io.File;

public class Ex1Test {
    @Test
    public void sortFilesTest() {
        File[] array = new File[5];
        array[0] = new File("D:/test/test1/file2.txt");
        array[1] = new File("D:/tAst/file1.txt");
        array[2] = new File("D:/tast/test1/test2/file3.txt");
        array[3] = new File("D:/test/test1/test2/");
        array[4] = new File("file4.txt");

        System.out.println("UNSORTED:");
        for (File file :array) {
            System.out.println(file.getPath());
        }
        File[] result = Ex1.sortFiles(array);
        System.out.println("SORTED:");
        for (File file :result) {
            System.out.println(file.getPath());
        }
    }
}