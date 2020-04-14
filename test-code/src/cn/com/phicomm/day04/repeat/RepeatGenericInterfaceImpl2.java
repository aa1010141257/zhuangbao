package cn.com.phicomm.day04.repeat;

import java.util.Collection;

public class RepeatGenericInterfaceImpl2<T> implements RepeatGenericInterface<T>{

    @Override
    public void print(T t) {
        System.out.println(t);
    }

    // 泛型高级通配符，基本上很少用到
    public void print2(Collection<? extends Collection> coll) {

    }
}
