package com.jd.bloomfilter;

import java.util.HashSet;
import java.util.Set;

public class testSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("111");
        set.add("222");
        set.add("111");
        System.out.println(set.size());
    }
}
