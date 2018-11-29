package com.jd.foreach;

import java.util.HashMap;
import java.util.Map;

public class Maptest {
    public static void main(String[] args) {
        System.out.println(" ============Java8之前的方式==========");
       Map<String,Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }

        System.out.println("============forEach + Lambda表达式==========");
        Map<String, Integer> items1 = new HashMap<>();
        items1.put("A", 10);
        items1.put("B", 20);
        items1.put("C", 30);
        items1.put("D", 40);
        items1.put("E", 50);
        items1.put("F", 60);
        items1.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
        items1.forEach((k,v)->{
            System.out.println("Item : " + k + " Count : " + v);
            if("E".equals(k)){
                System.out.println("Hello E");
            }
        });
    }
}
