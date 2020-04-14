package cn.com.phicomm.day04.repeat;

public class ThreadCap implements Runnable {

    @Override
    public void run(){
        while(true) {

            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
