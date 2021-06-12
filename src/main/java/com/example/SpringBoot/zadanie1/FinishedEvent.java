package com.example.SpringBoot.zadanie1;

import org.springframework.context.ApplicationEvent;

public class FinishedEvent extends ApplicationEvent {
    public FinishedEvent(Object source) {
        super(source);
    }
}
