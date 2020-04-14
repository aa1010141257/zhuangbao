package cn.com.phicomm.day03;

public class MyRunnable01 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "=" + i);
        }
    }
}
