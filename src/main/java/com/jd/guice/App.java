package com.jd.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppInjector());
        MyApplication app = injector.getInstance(MyApplication.class);
        app.sendMessage("hello","xm");
    }
}
