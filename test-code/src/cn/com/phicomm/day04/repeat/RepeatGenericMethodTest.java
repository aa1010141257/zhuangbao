package cn.com.phicomm.day04.repeat;

public class RepeatGenericMethodTest {

    public static void main(String[] args) {
        Object obj = new Object();
        RepeatGenericMethod.printMethod(obj);

        System.out.println("=========================");

        RepeatGenericObject rgo = new RepeatGenericObject("234234");

        RepeatGenericObject rgo2 = new RepeatGenericObject(new RepeatGenericMethod());

        rgo.toString();

        rgo2.toString();

        System.out.println("=========================");

        RepeatGenericInterfaceImpl repeatGenericInterfaceImpl = new RepeatGenericInterfaceImpl();

        repeatGenericInterfaceImpl.print("fdsfds");

        System.out.println("=========================");

        RepeatGenericInterfaceImpl2 repeatGenericInterfaceImpl2 = new RepeatGenericInterfaceImpl2();

        repeatGenericInterfaceImpl2.print("sdfjklj234");
    }
}
