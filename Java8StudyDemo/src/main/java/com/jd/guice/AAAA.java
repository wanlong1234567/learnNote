package com.jd.guice;

import com.google.inject.Binder;
import com.google.inject.Module;

public class AAAA implements Module {
    @Override
    public void configure(Binder binder) {
       // binder.bind(Vehicle.class).to((Class<? extends Vehicle>) FrogMan.class);
    }
}
