package cn.com.phicomm.day05.reflect;

import cn.com.phicomm.day05.domain.Person;

public class ReflectDemo01 {

    public static void main(String[] args) throws Exception {

        Class cls1 = Class.forName("cn.com.phicomm.day05.domain.Person");
        System.out.println(cls1);

        Class cls2 = Person.class;
        System.out.println(cls2);

        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);


    }
}
