package com.example.SpringBoot.zadanie1;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private final ApplicationEventPublisher publisher;

    public Calculator(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void increment() {
        for (int i = 0; i<=100; i++) {
            System.out.println("index: "+i);
            if (i%2==0) {
                //publikujemy event
                publisher.publishEvent(new EvenEvent(this));
            }
        }
        publisher.publishEvent(new FinishedEvent(this));
    }

}
