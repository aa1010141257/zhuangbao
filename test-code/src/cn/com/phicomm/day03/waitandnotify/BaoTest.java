package cn.com.phicomm.day03.waitandnotify;


public class BaoTest {

    public static void main(String[] args) {

        BaoZi baoZi = new BaoZi();

        BaoZiPu baoZiPu = new BaoZiPu(baoZi);
        ChiHuo chiHuo = new ChiHuo(baoZi);

        baoZiPu.start();
        chiHuo.start();
    }
}
