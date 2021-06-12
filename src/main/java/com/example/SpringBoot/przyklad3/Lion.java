package com.example.SpringBoot.przyklad3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Lion implements Animal {

    @Override
    public void displayName() {
        System.out.println("I am Lion");
    }
}
