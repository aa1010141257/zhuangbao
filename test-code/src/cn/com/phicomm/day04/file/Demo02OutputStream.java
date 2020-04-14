package cn.com.phicomm.day04.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02OutputStream {

    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(new File("/Users/xiaojun/IdeaProjects/test-code/src/cn/com/phicomm/day04/file/abc.txt"),true);

        fileOutputStream.write("全世界最漂亮的女孩子叫庄宝".getBytes());

        fileOutputStream.close();
    }
}
