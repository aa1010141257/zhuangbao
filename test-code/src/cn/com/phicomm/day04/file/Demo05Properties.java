package cn.com.phicomm.day04.file;

import cn.com.phicomm.Const;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo05Properties {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.setProperty("李正旺", "29");
        properties.setProperty("庄艳", "27");
        properties.setProperty("华为手机p10", "3");
        properties.setProperty("华为手机nova", "1");

        properties.store(new FileWriter(Const.IDEA_PATH + "/day04/file/properties.txt"), "this is some person infomation");


    }
}
