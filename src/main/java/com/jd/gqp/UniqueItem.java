package com.jd.gqp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueItem {

    /**
     * 将一个数组中所有重复的元素去掉，保留第一个
     */
    public static List<String> uniqueItemKeepFirst(List<String> origin){

//利用set数据的key特性去除重复保留第一个数据,值为1
        Set<String> compSet = new HashSet<String>();

//定义返回唯一的去重了数组
        List<String> resultList = new ArrayList<String>();

        for (String item : origin) {

//添加新元素
            if (!compSet.contains(item)) {
                compSet.add(item);
                resultList.add(item);
            }

        }

        return resultList;

    }

    /**
     * 将一个数组中所有重复的元素去掉，保留最后一个
     */
    public static List<String> uniqueItemKeepLast(List<String> origin){

//利用set数据的key特性去除重复保留第一个数据,值为1
        Set<String> compSet = new HashSet<String>();

//定义返回唯一的去重了数组
        List<String> resultList = new ArrayList<String>();

        for (String item : origin) {

//添加新元素
            if (!compSet.contains(item)) {
                compSet.add(item);
//最新的总是添加
                resultList.add(item);
            }else {
//存在替换这个元素
                resultList.set(resultList.indexOf(item), item);
            }

        }

        return resultList;

    }

    /**
     * 将一个数组中所有重复的元素去掉，保留第一个
     */
    public static List<User> uniqueItemKeepFirstUser(List<User> origin){

//利用set数据的key特性去除重复保留第一个数据,值为1
        Set<User> compSet = new HashSet<User>();

//定义返回唯一的去重了数组
        List<User> resultList = new ArrayList<User>();

        for (User item : origin) {

//添加新元素
            if (!compSet.contains(item)) {
                compSet.add(item);
                resultList.add(item);
            }

        }

        return resultList;

    }


    /**
     * 将一个数组中所有重复的元素去掉，保留最后一个
     */
    public static List<User> uniqueItemKeepLastUser(List<User> origin){

//利用set数据的key特性去除重复保留第一个数据,值为1
        Set<User> compSet = new HashSet<User>();

//定义返回唯一的去重了数组
        List<User> resultList = new ArrayList<User>();

        for (User item : origin) {

//添加新元素
            if (!compSet.contains(item)) {
                compSet.add(item);
//最新的总是添加
                resultList.add(item);
            }else {
//存在则替换这个元素
                resultList.set(resultList.indexOf(item), item);
            }
        }

        return resultList;

    }

}

