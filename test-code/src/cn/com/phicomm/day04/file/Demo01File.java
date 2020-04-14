package cn.com.phicomm.day04.file;

import java.io.File;
import java.io.IOException;

public class Demo01File {

    public static void main(String[] args) {
        show01();

    }

    private static void show01() {

        File f1 = new File("/Users/xiaojun/IdeaProjects/test-code/src/cn/com/phicomm/day04/file/dabc.txt");

            try {
                System.out.println(f1.createNewFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
