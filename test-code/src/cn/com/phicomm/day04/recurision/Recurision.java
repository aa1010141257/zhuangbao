package cn.com.phicomm.day04.recurision;

import java.io.File;

public class Recurision {

    public static void main(String[] args) {
//        System.out.println(sumMethod(10));
        File dir = new File("/Users/xiaojun/IdeaProjects/test-code/src/cn/com/phicomm");
        printFile(dir);
    }

    /*
        递归阶层1*2*3*...*n-1*n
     */
    public static int sumMethod(int n) {
        if (n == 1) {
            return 1;
        }
        return n * sumMethod(n - 1);
    }

    /*
        递归输出所有文件名
     */
    public static void printFile(File dir) {
        System.out.println("dir = [" + dir + "]");
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                printFile(file);
            } else {
                System.out.println(file.getName());
            }
        }
    }
}
