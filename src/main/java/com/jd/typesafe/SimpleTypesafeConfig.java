package com.jd.typesafe;

import com.typesafe.config.ConfigFactory;
import jdk.nashorn.internal.runtime.regexp.joni.Config;

public class SimpleTypesafeConfig {
    private Config config;

    public SimpleTypesafeConfig(Config config) {
        this.config = config;
       // config.checkValid(ConfigFactory.defaultReference(), "conf");
    }
    public SimpleTypesafeConfig() {
        this((Config) ConfigFactory.load());
    }

    public void printSetting(String path) {
      //  System.out.println("The setting '" + path + "' is: " + config.getString(path));
    }
    public static void main(String[] args) {
        SimpleTypesafeConfig s = new SimpleTypesafeConfig();
        s.printSetting("properties.whatever");//application.properties

        //output: The setting 'properties.whatever' is: "This value comes from simple-app's application.properties"
        s.printSetting("conf.whatever");//application.conf

        //output:The setting 'conf.whatever' is: This value comes from simple-app's application.conf
        s.printSetting("label");//application.conf

        //output: person
    }
}
