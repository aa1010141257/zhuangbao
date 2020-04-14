package cn.com.phicomm.day02;

public class GenericMethodTest {

    public static void main(String[] args) {

        GenericMethod gm = new GenericMethod();

        gm.method01(132);
        gm.method01("sdfsdf");
        gm.method01(8.8);
        gm.method01(true);

    }
}
