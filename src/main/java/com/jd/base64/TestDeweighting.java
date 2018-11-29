package com.jd.base64;
//去重测试
public class TestDeweighting {
    public static void main(String[] args) {
        //错误率
        double falsePositiveProbability =0.1;
        //预估的元素个数
        int expectedNumberOfElements = 100000000;
        BloomFilter bloomFilter = new BloomFilter(falsePositiveProbability, expectedNumberOfElements);

        bloomFilter.add("yy");
        bloomFilter.add("xx");
        if (bloomFilter.contains("yy")) { // Always returns true
            System.out.println("BloomFilter contains yy!");
            System.out.println("Probability of a false positive: " + bloomFilter.expectedFalsePositiveProbability());
        }

        if (bloomFilter.contains("bar")) { // Should return false, but could return true
            System.out.println("There was a false positive.");
        }
       // System.out.println("bloomFilter:"+bloomFilter);
    }
}
