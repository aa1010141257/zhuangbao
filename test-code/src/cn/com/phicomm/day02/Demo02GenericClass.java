package cn.com.phicomm.day02;

public class Demo02GenericClass {

    public static void main(String[] args) {
        GenericClass gc = new GenericClass();
        gc.setName("字符串");
        Object obj = gc.getName();
        System.out.println(gc.getName());

        GenericClass<Integer> gc2 = new GenericClass<>();


        Integer name = gc2.getName();
    }
}
