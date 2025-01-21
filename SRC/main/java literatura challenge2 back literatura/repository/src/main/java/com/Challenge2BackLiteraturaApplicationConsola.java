package SRC.main.java literatura challenge2 back literatura.repository.src.main.java.com;

public class liteLiteraturaApplicationConsola {
    package com.literatura.challenge_2_back_literatura;
import com.literatura.challenge_2_back_literatura.Libreria.Libreria;
import com.literatura.challenge_2_back_literatura.repository.iAutorRepository;
import com.literatura.challenge_2_back_literatura.repository.iLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class Challenge2BackLiteraturaApplicationConsola implements CommandLineRunner {

	@Autowired
	private iLibroRepository libroRepository;
	@Autowired
	private iAutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(Challenge2BackLiteraturaApplicationConsola.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Libreria libreria = new Libreria(libroRepository, autorRepository);
		libreria.consumo();

	}
}
}
