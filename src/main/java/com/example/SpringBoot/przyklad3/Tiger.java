package com.example.SpringBoot.przyklad3;

import org.springframework.stereotype.Component;

@Component("tygrys")
public class Tiger implements Animal {

    @Override
    public void displayName() {
        System.out.println("I am Tiger");
    }
}
