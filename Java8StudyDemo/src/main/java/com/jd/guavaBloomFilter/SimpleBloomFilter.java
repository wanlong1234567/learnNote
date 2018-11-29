package com.jd.guavaBloomFilter;

import java.util.BitSet;

public class SimpleBloomFilter {
    private static final int DEFAULT_SIZE = 2 << 24;//布隆过滤的比特长度
    private static final int[] seeds = new int[]{7, 11, 13, 31, 37, 61,};
    private BitSet bits = new BitSet(DEFAULT_SIZE);
    private SimpleHash[] func = new SimpleHash[seeds.length];

    public static void main(String[] args) {
        String value = " stone2083@yahoo.cn ";
        SimpleBloomFilter filter = new SimpleBloomFilter();
        // System.out.println(filter.contains(value));
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            filter.add("a" + i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        //  filter.add(value);
        System.out.println(filter.contains(value));
//        SimpleBloomFilter filter = new SimpleBloomFilter();
//        int count = 0;
//        long start = System.currentTimeMillis();
//        for(int i=0;0<500000;i++){
//            if(!filter.contains("aa"+i)){
//                filter.add("aa"+i);
//                count++;
//            }
//        }

    }

    public SimpleBloomFilter() {
        for (int i = 0; i < seeds.length; i++) {
            func[i] = new SimpleHash(DEFAULT_SIZE, seeds[i]);
        }
    }

    public void add(String value) {
        for (SimpleHash f : func) {
            bits.set(f.hash(value), true);
        }
    }

    public boolean contains(String value) {
        if (value == null) {
            return false;
        }
        boolean ret = true;
        for (SimpleHash f : func) { ////这里其实没必要全部跑完，只要一次ret==false那么就不包含这个字符串
            ret = ret && bits.get(f.hash(value));
        }
        return ret;
    }

    public static class SimpleHash {////这玩意相当于C++中的结构体
        private int cap;
        private int seed;

        public SimpleHash(int cap, int seed) {
            this.cap = cap;
            this.seed = seed;
        }

        public int hash(String value) {//字符串哈希，选取好的哈希很重要
            int result = 0;
            int len = value.length();
            for (int i = 0; i < len; i++) {
                result = seed * result + value.charAt(i);
            }
            return (cap - 1) & result;
        }
    }
}
