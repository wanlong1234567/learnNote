package com.jd.lambda;

import java.util.ArrayList;
import java.util.List;

public class Java8MethodTest {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);
        names.forEach(name-> System.out.println(name));
    }
}
