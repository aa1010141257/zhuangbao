package cn.com.phicomm.day03;

public class Demo04Thread {

    public static void main(String[] args) {
        Demo03Thread thread1 = new Demo03Thread("新线程1");
        Demo03Thread thread2 = new Demo03Thread("新线程2");


        for (int i = 0; i < 100; i++) {
            System.out.println("main = " + i);
        }
        thread2.start();
        thread1.start();
    }
}
