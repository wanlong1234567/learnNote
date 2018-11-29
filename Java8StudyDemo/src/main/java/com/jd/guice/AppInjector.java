package com.jd.guice;

import com.google.inject.AbstractModule;

public class AppInjector extends AbstractModule {
    @Override
    protected void configure() {
        bind(MessageService.class).to(EmailServiceImpl.class);
    }
}
