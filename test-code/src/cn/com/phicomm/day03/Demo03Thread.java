package cn.com.phicomm.day03;


public class Demo03Thread extends Thread {

    public Demo03Thread (){}

    public Demo03Thread(String threadName) {
        this.setName(threadName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + i);
        }
    }
}
