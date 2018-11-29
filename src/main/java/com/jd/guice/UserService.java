package com.jd.guice;

public interface UserService {
    void process();
}

class UserServiceImpl implements UserService{

    @Override
    public void process() {
        System.out.println("我需要做一些业务");
    }
}
