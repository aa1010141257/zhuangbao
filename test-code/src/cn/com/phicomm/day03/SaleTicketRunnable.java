package cn.com.phicomm.day03;

public class SaleTicketRunnable implements Runnable {

    private static Integer tiket = 100;

    @Override
    public synchronized void run() {
        while(tiket > 0) {
            System.out.println(Thread.currentThread().getName() + "正在售票中，第" + tiket + "张票");
            --tiket;
        }
    }
}
