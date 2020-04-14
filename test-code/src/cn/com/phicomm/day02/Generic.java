package cn.com.phicomm.day02;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic {

    public static void main(String[] args) {
        show1();
    }

    private  static void show1() {
        ArrayList list = new ArrayList();

        list.add("add");
        list.add(1);
        Iterator it = list.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
