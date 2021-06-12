package com.example.SpringBoot.zadanie1;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class Listener {

    private List<Integer> integers = new ArrayList<>();

    @EventListener
    public void onEvent(EvenEvent evenEvent) {
        System.out.println("is Even");
        integers.add(new Random().nextInt(1000));
    }

    @EventListener
    public void onEvent(FinishedEvent finishedEvent) {
        integers.forEach(System.out::println);
    }

}
