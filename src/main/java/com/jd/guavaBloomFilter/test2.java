package com.jd.guavaBloomFilter;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnel;
import com.google.common.hash.Funnels;
import com.google.common.hash.PrimitiveSink;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

/**
 * 谷歌的bloomFilter
 */
public class test2 {
    private  int size = 500000;
     public BloomFilter<String> bloomFilter = BloomFilter.create(new Funnel<String>() {
       @Override
       public void funnel(String s, PrimitiveSink primitiveSink) {
           primitiveSink.putString((CharSequence) s, Charset.forName("UTF-8"));
       }
   },size);

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        test2 test2 = new test2();
//        test2.bloomFilter.put("111");
//        boolean mightContain = test2.bloomFilter.mightContain("111");
//        System.out.println(mightContain);
        int count = 0;
        long start = System.currentTimeMillis();
        for(int i=0;i<500000;i++){
            if(!test2.bloomFilter.mightContain("aa"+i)){
                test2.bloomFilter.put("aa"+i);
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("count:"+count);
        System.out.println(end-start);

    }

}
