package com.jd.bloomfilter;

public class TestSimpleBloomFilter {
    public static void main(String[] args) {
//        SimpleBloomFilter mammals = new SimpleBloomFilter(14000000,500000);
        SimpleBloomFilter mammals = new SimpleBloomFilter(0.1,500000);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            if (!mammals.contains("a" + i)) {
                mammals.add("a" + i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Total cost time:[" + (end - start) + "] ms ");
        System.out.println("count:[" + mammals.count() + "] ");
        System.out.println("size:[" + mammals.size() + "] ");


    }
}
