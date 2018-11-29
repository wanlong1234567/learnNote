package com.jd.Stream;

import java.util.HashSet;
import java.util.Set;

public class test77 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        long start = System.currentTimeMillis();
        for(int i =0;i<500000;i++){
            set.add("a"+i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
