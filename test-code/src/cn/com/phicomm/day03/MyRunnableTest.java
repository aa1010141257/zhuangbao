package cn.com.phicomm.day03;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class MyRunnableTest {

    public static void main(String[] args) {

        MyRunnable01 myRunnable01 = new MyRunnable01();

        new Thread(myRunnable01).start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "=" + i);
        }
    }
}
