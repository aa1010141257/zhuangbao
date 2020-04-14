package cn.com.phicomm.day04.repeat;

/*
    p333
 */
public class RepeatGenericInterfaceImpl implements RepeatGenericInterface<String> {


    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
