package com.jd.gqp;

import java.util.ArrayList;
import java.util.List;

public class TestMain {


    public static void main(String[] args) throws InterruptedException {

//
        String[] millios = new String[11];
        millios[0]="guo1";
        millios[1]="guo2";
        millios[2]="guo3";
        millios[3]="guo4";
        millios[4]="guor";
        millios[5]="guo1";
        millios[6]="guo4";
        millios[7]="guo3";
        millios[8]="guo2";
        millios[9]="guo1";
        millios[10]="nihao";

//产生100W条数据

        List<User> origin = new ArrayList<User>();
        long gendataStart = System.currentTimeMillis();
        for (int i = 0; i < 25000000; i++) {
            User u = new User(millios[i%11],System.currentTimeMillis());
            origin.add(u);
        }
        long gendataend = System.currentTimeMillis();
        System.out.println("产生100w条数据的时间是:"+(gendataend-gendataStart)+"毫秒");

//遍历
        long gendataStart0 = System.currentTimeMillis();
        for (int i = 0; i < origin.size(); i++) {
            origin.get(i);
        }
        long gendataend0 = System.currentTimeMillis();
        System.out.println("遍历100w条数据的时间是:"+(gendataend0-gendataStart0)+"毫秒");

//剔除重复数据,保留第一条
        long gendataStart1 = System.currentTimeMillis();
        List<User> fList = UniqueItem.uniqueItemKeepFirstUser(origin);
        long gendataend1 = System.currentTimeMillis();
        System.out.println("100w条数据去重保留第一条的时间是:"+(gendataend1-gendataStart1)+"毫秒");

//剔除重复数据,保留第一条
        long gendataStart2 = System.currentTimeMillis();
        List<User> LList =UniqueItem.uniqueItemKeepLastUser(origin);
        long gendataend2 = System.currentTimeMillis();
        System.out.println("100w条数据去重保留最后一条的时间是:"+(gendataend2-gendataStart2)+"毫秒");

//一下是结果的对比
        System.out.println(fList.toString());
        for (User user : fList) {

            System.out.println(user.getName()+"-"+user.getGenLong());//结果一样，但是可以从数据产生时的时间可以看出保留第一个

        }

        System.out.println(LList.toString());
        for (User user : LList) {
            System.out.println(user.getName()+"-"+user.getGenLong());//结果一样，但是可以从数据产生时的时间可以看出保留最后一个
        }
    }


}

