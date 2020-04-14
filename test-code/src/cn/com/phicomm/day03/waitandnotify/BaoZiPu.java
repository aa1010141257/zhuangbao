package cn.com.phicomm.day03.waitandnotify;

// 生产者包子铺
public class BaoZiPu extends Thread{

    private BaoZi baoZi;

    public BaoZiPu(){}

    public BaoZiPu(BaoZi baoZi){
        this.baoZi = baoZi;
    }

    @Override
    public void run() {

        int count = 0;
        while(true) {

            synchronized (baoZi) {
                if (baoZi.flag == true) {
                    // 有包子吃
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (count % 2 == 0) {

                    baoZi.pi = "皮";
                    baoZi.xian = "三鲜陷";
                } else {
                    baoZi.pi = "冰皮";
                    baoZi.xian = "牛肉大葱陷";

                }
                // 生产不同的包子
                count ++;
                System.out.println("包子铺正在生产：" + baoZi.pi + baoZi.xian + "包子");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baoZi.flag = true;
                baoZi.notify();
                System.out.println("包子铺已经生产好了：" + baoZi.pi + baoZi.xian + "包子");
            }
        }
    }
}
