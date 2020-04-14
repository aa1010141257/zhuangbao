package cn.com.phicomm.day05;

import java.io.*;
import java.net.Socket;

/*
    上传的文件路径"/Users/xiaojun/Desktop/bookmarks_copy.html"
 */
public class TCPClient {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("/Users/xiaojun/Desktop/bookmarks_copy.html");

        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream outputStream = socket.getOutputStream();


        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
        inputStream.close();
        outputStream.close();
    }
}
