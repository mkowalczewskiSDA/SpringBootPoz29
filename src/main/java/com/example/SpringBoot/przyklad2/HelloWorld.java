package com.example.SpringBoot.przyklad2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class HelloWorld {

    private final AnotherBean anotherBean;

    private YetAnotherBean yetAnotherBean;

    public HelloWorld(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    @Autowired
    public void setAnotherBean(YetAnotherBean yetAnotherBean) {
        this.yetAnotherBean = yetAnotherBean;
    }

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    public YetAnotherBean getYetAnotherBean() {
        return yetAnotherBean;
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void display() {
        System.out.println("Hello World");
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean is initializing");
    }

    @PreDestroy
    public void destory() {
        System.out.println("Bean will be destroyed now");
    }
}
