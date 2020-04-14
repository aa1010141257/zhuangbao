package cn.com.phicomm.day04.lambda;

import java.util.Arrays;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person("张三", 11);
        Person person2 = new Person("李四", 44);
        Person person3 = new Person("黄晓明", 20);

        Person[] people = {person1, person2, person3};

        for (Person p : people) {

            System.out.println(p);
        }
        System.out.println("===============");

        Arrays.sort(people, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });


        for (Person p : people) {

            System.out.println(p);
        }

    }
}

