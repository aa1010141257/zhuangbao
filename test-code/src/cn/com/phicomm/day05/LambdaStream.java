package cn.com.phicomm.day05;

import java.util.ArrayList;

public class LambdaStream {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("张三丰");
        list.add("张无忌");
        list.add("赵雅若");
        list.add("无忌");
        list.add("张三");

        list.stream()
                .filter(name -> name.startsWith("赵"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));
    }
}
