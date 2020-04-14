package cn.com.phicomm.day04.lambda;

/*
    Lambda表达式简化匿名内部类的书写
 */
public class Demo01Cook  {

    public static void main(String[] args) {
        invokeCook(new Cook(){
            @Override
            public void makeFood() {
                System.out.println("吃饭啦！！");

            }
        });

        invokeCook(()->{
            System.out.println("吃饭啦！！");
        });
    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }

}
