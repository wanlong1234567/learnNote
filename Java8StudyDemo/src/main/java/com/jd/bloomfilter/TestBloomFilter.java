package com.jd.bloomfilter;
import java.util.Date;

/**
 * https://github.com/magnuss/java-bloomfilter
 */
public class TestBloomFilter {
    public static void main(String[] args) {
        //错误率
        double falsePositiveProbability =0.1;
        //预估的元素个数
        int expectedNumberOfElements = 500000;
        long uv = 0L;
        long pv = 0L;
        Runtime rt = Runtime.getRuntime();
        long start = System.currentTimeMillis();
        System.out.println("start at [" + new Date() + "] ..");
        BloomFilter bloomFilter = new BloomFilter(falsePositiveProbability, expectedNumberOfElements);

        for(int i =0;i<500000;i++){//代表着1天1条的数据
            if(!bloomFilter.contains("a"+i)){
                bloomFilter.add("a"+i);
                uv++;
            }
        }
//        bloomFilter.add("foo");
//
//        if (bloomFilter.contains("foo")) { // Always returns true
//            System.out.println("BloomFilter contains foo!");
//            System.out.println("Probability of a false positive: " + bloomFilter.expectedFalsePositiveProbability());
//        }
//
//        if (bloomFilter.contains("bar")) { // Should return false, but could return true
//            System.out.println("There was a false positive.");
//        }

        long end = System.currentTimeMillis();
       // System.out.println("end at [" + new Date() + "] ..");
        System.out.println("Total cost [" + (end - start) + "] ms ..");
        System.out.println("count:[" + bloomFilter.count() + "] ..");
        System.out.println("size:[" + bloomFilter.size() + "] ..");
        System.out.println("uv:"+uv);
    }
}
