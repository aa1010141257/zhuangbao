package cn.com.phicomm.day01;

import java.util.Scanner;

public class Demo02ScannerAdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("两个数字之和num1 + num2 = " + (num1 + num2));
    }
}
