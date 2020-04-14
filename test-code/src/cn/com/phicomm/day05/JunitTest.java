package cn.com.phicomm.day05;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class JunitTest {

    @Test
    public void testLambda() {
        ArrayList<String> list = new ArrayList<String>();

        list.add("张三丰");
        list.add("张无忌");
        list.add("赵雅若");
        list.add("无忌");
        list.add("张三");

        list.stream()
                .filter(name -> name.startsWith("赵"))
                .filter(name->name.length()==3)
                .forEach(name-> {
                    System.out.println(name);
                    Assert.assertEquals(name,"赵雅若");});


    }
}
