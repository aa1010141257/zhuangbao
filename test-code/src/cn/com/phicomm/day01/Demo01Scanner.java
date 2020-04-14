package cn.com.phicomm.day01;

import java.util.Scanner;

public class Demo01Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String str = scanner.next();

        System.out.println("num = " + num + ", " + "str = " + str);
    }
}
