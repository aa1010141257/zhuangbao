package cn.com.phicomm.day04.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04CopyFile {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("/Users/xiaojun/IdeaProjects/test-code/src/cn/com/phicomm/day04/file/bookmarks_2017_11_1(1).html");

        FileOutputStream fileOutputStream = new FileOutputStream("/Users/xiaojun/IdeaProjects/test-code/src/cn/com/phicomm/day04/file/bookmarks_copy.html");

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, len);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
