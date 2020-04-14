package cn.com.phicomm.day04.lambda;

public class Demo02Calculator {

    public static void main(String[] args) {

        /*invokeCal(2, 3, new InvokeInterface() {
            @Override
            public int cal(int a, int b) {
                return 0;
            }
        });*/

        invokeCal(4,5,(a,b)->a+b);
    }



    public static void invokeCal(int a, int b, InvokeInterface cal) {
        int sum = cal.cal(a, b);
        System.out.println("a = [" + a + "], b = [" + b + "], cal = [" + sum + "]");
    }
}
