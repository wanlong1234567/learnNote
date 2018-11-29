package com.jd.guice;

public class EmailServiceImpl implements MessageService {
    @Override
    public boolean sendMessage(String msg, String receiver) {
        System.out.println("SMS sent to " + receiver + " with Message= " + msg);
        return true;
    }
}
