package com.jd.Stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Java8 API添加了一个新的抽象称为流Stream.可以让你声明的方式处理数据。
 * Stream 使用一种类似用 SQL 语句从数据库查询数据的直观方式来提供一种对 Java 集合运算和表达的高阶抽象。

 Stream API可以极大提高Java程序员的生产力，让程序员写出高效率、干净、简洁的代码。

 这种风格将要处理的元素集合看作一种流， 流在管道中传输， 并且可以在管道的节点上进行处理， 比如筛选， 排序，聚合等。

 元素流在管道中经过中间操作（intermediate operation）的处理，最后由最终操作(terminal operation)得到前面处理的结果。

 @author wl

 *
 * 什么是流Stream?
 * Stream(流)是一个来自数据源的元素队列并支持聚合操作
 *
 * 元素是特定类型的对象，形成一个队列。 Java中的Stream并不会存储元素，而是按需计算。
 数据源 流的来源。 可以是集合，数组，I/O channel， 产生器generator 等。
 聚合操作 类似SQL语句一样的操作， 比如filter, map, reduce, find, match, sorted等。

 和以前的Collection操作不同,Stream操作还有2个基本特征

 Pipelining:中间操作都会返回流对象本身。这样多个操作可以串联成一个管道，如同流式风格。
 这样做可以对操作进行优化，比如延迟执行(laziness)和短路(short-circulting)

 内部迭代：以前对集合遍历都是通过Iterator或者For-each的方式，显式的在集合外部进行迭代，这叫做外部迭代
 Stream提供了内部迭代的方式，通过访问者模式实现

 生成流：
 在Java8中，集合接口有2个方法来生成流：
 Stream():为集合创建串行流
 parallelStream():为集合创建并行流
 */
public class JavaStreamTest1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc","","bc","efg","abcd","","kjk");
        List<String> filterd = strings.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
        System.out.println("collect:收集结果："+filterd);

        //forEach来迭代流中的每个数据
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        //数组
        List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);
        //获取数组每个数的平方，而且是不同
        List<Integer> squaresList = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
        System.out.println("map:用于映射每个元素到对应的结果"+squaresList);

        //sorted方法用于对流进行排序
        Random random1 = new Random();
        random1.ints().limit(10).sorted().forEach(System.out::println);

        List<String> strings1 = Arrays.asList("abc","","bc","efg","abcd","","kjk");
       int count = (int) strings1.parallelStream().filter(string->string.isEmpty()).count();
        System.out.println("并行parallel程序："+count);

        /**
         * Collectors类实现了很多归约操作，例如将流转换成集合和聚合元素，Collectors可用于返回列表或字符串
         */
        List<String> string2 = Arrays.asList("abc","","bc","efg","abcd","","kjk");
        List<String> filter2 = string2.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
        System.out.println("Collectors:"+filter2);
        String meregedString =string2.stream().filter(string->!string.isEmpty()).collect(Collectors.joining(","));
        System.out.println("Collectors合并字符串："+meregedString);

        List<Integer> numbers1 = Arrays.asList(3,2,2,3,7,3,5);
        IntSummaryStatistics statistics = numbers1.stream().mapToInt((x)->x).summaryStatistics();
        System.out.println("列表中最大的数 : " + statistics.getMax());
        System.out.println("列表中最小的数 : " + statistics.getMin());
        System.out.println("所有数之和 : " + statistics.getSum());
        System.out.println("平均数 : " + statistics.getAverage());
    }
}
