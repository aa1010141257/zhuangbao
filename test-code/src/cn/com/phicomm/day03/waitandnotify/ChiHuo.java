package cn.com.phicomm.day03.waitandnotify;

// 消费者吃包子
public class ChiHuo extends Thread {

    private BaoZi baoZi;

    public ChiHuo(){}

    public ChiHuo(BaoZi baoZi){
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (baoZi) {
                if (baoZi.flag == false) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

                // 被唤醒之后执行的代码，吃包子
                System.out.println("吃货正在吃" + baoZi.pi + baoZi.xian + "包子");
                baoZi.flag = false;
                baoZi.notify();
                System.out.println("吃货已经把" + baoZi.pi + baoZi.xian + "的包子吃完了，通知包子铺生产包子");
                System.out.println("========================");
            }

        }
    }
}
