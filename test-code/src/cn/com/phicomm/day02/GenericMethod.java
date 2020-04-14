package cn.com.phicomm.day02;

import java.util.HashSet;

public class GenericMethod {

    public <M> void method01(M m) {
        System.out.println(m);
    }

    public static <M> void method02(M m) {
        System.out.println(m);

        HashSet<String> set = new HashSet<>();
        set.add("abc");
    }
}


