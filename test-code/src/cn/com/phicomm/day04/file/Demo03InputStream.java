package cn.com.phicomm.day04.file;

import cn.com.phicomm.Const;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo03InputStream {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(Const.IDEA_PATH + "day04/file/abc.txt");


        int len = 0;
        byte[] bytes = new byte[1024];
        String inputStr = "";
        while ((len = fileInputStream.read(bytes)) != -1) {
            inputStr = new String(bytes, 0, len);
        }
        System.out.println(inputStr);

    }
}
