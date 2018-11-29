package com.jd.typesafe;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;


public class SimpleLibContext {
    private Config config;

    public SimpleLibContext(Config config) {
        this.config = config;
        config.checkValid(ConfigFactory.defaultApplication(),"simple-lib");
    }

    public SimpleLibContext() {
        this(ConfigFactory.load());
    }

    public void printSetting(String path){
        System.out.println("The setting '" + path + "' is: " + config.getString(path));

    }

    public static void main(String[] args) {
        SimpleLibContext s = new SimpleLibContext();
        s.printSetting("simple-app.answer");
    }
}
