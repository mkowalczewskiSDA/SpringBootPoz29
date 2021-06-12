package com.example.SpringBoot.zadanie1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Napisz program wykorzystujący beany i eventy.
//Napisz klasę Calculator, która będzie inkrementować liczby od 0 do 100, w przypadku wystąpienia liczby parzystej opublikuje event EvenEvent
//natomiast po zakończeniu pętli opublikuje FinishedEvent
//Stwórz listener, który po wywołaniu eventu EvenEvent doda losową liczbę do listy, a po wywołaniu Eventu FinishedEvent - wyświetli tą listę w konsoli.

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	Calculator calculator;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		calculator.increment();
	}
}
