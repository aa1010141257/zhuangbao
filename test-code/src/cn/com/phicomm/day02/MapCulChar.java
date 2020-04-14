package cn.com.phicomm.day02;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class MapCulChar {

    public static void main(String[] args) {

        System.out.println("请输入一个字符串");
        String inputStr = new Scanner(System.in).nextLine();

        while (Objects.equals(inputStr,"")) {
            System.out.println("您没有输入任何字符，请重新输入一个字符串");
            inputStr = new Scanner(System.in).nextLine();
        }
        Map<Character, Integer> map = findChar(inputStr);
        System.out.println(map);
    }

    private static Map<Character, Integer> findChar(final String inputStr) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars = inputStr.toCharArray();
        for (char ch : chars) {
            int a = 1;
            if (hashMap.containsKey(ch)) {
                a += hashMap.put(ch, hashMap.get(ch));
            }
            hashMap.put(ch, a);
        }

        return hashMap;
    }

}
