package com.jd.foreach;

import java.util.ArrayList;
import java.util.List;

public class Listtest {
    public static void main(String[] args) {
        System.out.println("============Java8之前的方式==========");
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        for(String item : items){
            System.out.println("before:"+item);
        }


        System.out.println("============forEach + Lambda表达式==========");
        List<String> items1 = new ArrayList<>();
        items1.add("A");
        items1.add("B");
        items1.add("C");
        items1.add("D");
        items1.add("E");
        //输出：A,B,C,D,E
        items1.forEach(item->System.out.println("after:"+item));
        //输出 : C
        items1.forEach(item->{
            if("C".equals(item)){
                System.out.println(item);
            }
        });
    }
}
