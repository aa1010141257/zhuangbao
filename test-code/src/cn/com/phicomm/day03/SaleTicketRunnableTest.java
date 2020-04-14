package cn.com.phicomm.day03;

public class SaleTicketRunnableTest {

    public static void main(String[] args) {

        SaleTicketRunnable sr = new SaleTicketRunnable();

        Thread t1 =  new Thread(sr);
        Thread t2 = new Thread(sr);
        Thread t3 = new Thread(sr);

        t1.start();
        t2.start();
        t3.start();
    }
}
