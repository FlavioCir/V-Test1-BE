package it.epicode.esercizio2.GodFather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Esercizio2G1S5Application {

	public static void main(String[] args) {
		SpringApplication.run(Esercizio2G1S5Application.class, args);
	
		GestioneMenu stampa = new GestioneMenu();
		stampa.stampaMenu();
		stampa.testTopping();
	}

}
