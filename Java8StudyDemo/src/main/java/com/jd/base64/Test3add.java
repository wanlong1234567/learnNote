package com.jd.base64;

public class Test3add {
    public static void main(String[] args) {
        //错误率
        double falsePositiveProbability =0.001;
        //预估的元素个数
        int expectedNumberOfElements = 50000000;
        BloomFilter bloomFilter = new BloomFilter(falsePositiveProbability, expectedNumberOfElements);
//        if(!bloomFilter.contains("aa")){
//            bloomFilter.add("aa");
//        }
//        System.out.println("count:"+bloomFilter.count());
//        System.out.println(24*60*60*60);
        bloomFilter.add("111");
        bloomFilter.add("2222");
        bloomFilter.add("111");
        System.out.println("count:"+bloomFilter.count());
        bloomFilter.clear();
        System.out.println("count2:"+bloomFilter.count());
    }
}
