package com.jd.guice;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyAppTest {
    private static Injector injector;
    @BeforeClass
    public static void init() {
       // injector = Guice.createInjector(new MyApp());
    }

    @Test
    public void testMyApp() {
        Application myApp = injector.getInstance(Application.class);
        myApp.work();
    }


     public void configure(Binder binder){
//        binder.bind(Vehicle.class).to();
     }
}