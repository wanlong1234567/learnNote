package com.jd.guice;

import com.google.inject.Inject;

public interface Application {
    void work();
}

class MyApp implements Application{

    private UserService userService;
    private  LogService logService;

    @Inject
    public MyApp(UserService userService, LogService logService) {
        this.userService = userService;
        this.logService = logService;
    }

    @Override
    public void work() {
        userService.process();;
        logService.log("程序运行正常");
    }
}
