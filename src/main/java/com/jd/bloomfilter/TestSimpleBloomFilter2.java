package com.jd.bloomfilter;

public class TestSimpleBloomFilter2 {
    public static void main(String[] args) {
        SimpleBloomFilter simpleBloomFilter = new SimpleBloomFilter(0.01,500000);
        long start = System.currentTimeMillis();
       simpleBloomFilter.add("111");
       simpleBloomFilter.add("2222");
       //      !真
       if(!simpleBloomFilter.contains("111")){
           System.out.println("X");
       }else{
           simpleBloomFilter.add("X");
        }
        long end = System.currentTimeMillis();
        System.out.println("Total cost time:[" + (end - start) + "] ms ");
        System.out.println("count:[" + simpleBloomFilter.count() + "] ");
        System.out.println("size:[" + simpleBloomFilter.size() + "] ");
    }
}
