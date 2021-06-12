package com.example.SpringBoot.przyklad4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ExamplePublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publish(String message) {
        System.out.println("Publishing custom event");
        ExampleEvent exampleEvent = new ExampleEvent(this, message);
        applicationEventPublisher.publishEvent(exampleEvent);
    }
}
