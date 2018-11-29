package com.jd.typesafe;

import com.typesafe.config.ConfigFactory;
import jdk.nashorn.internal.runtime.regexp.joni.Config;

public class Configure {
    private final Config config;

    public Configure(String confFileName) {
        config = (Config) ConfigFactory.load(confFileName);
    }

    public Configure() {
        config = (Config) ConfigFactory.load();
    }

    public String getString(String name) {
        return name;
    }

    public static void main(String[] args) {
//        Config firstConfig = (Config) ConfigFactory.load("test1.conf");
//        System.out.println("FirstConfig:"+firstConfig);
        Config config = (Config) ConfigFactory.load();

    }
}
