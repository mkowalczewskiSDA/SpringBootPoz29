package com.example.SpringBoot.przyklad4;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ExampleListener {

    @EventListener
    public void onEvent(ExampleEvent exampleEvent) {
        System.out.println("Example event has been triggered "+exampleEvent.getMessage());
    }
}
