package cn.com.phicomm.day02;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericInterfaceImpl1<T> implements GenericInterface<T> {

    @Override
    public void method(T t) {

        ArrayList<String> list = new ArrayList<>();
        list.add("21323");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("asdf");
    }
}
