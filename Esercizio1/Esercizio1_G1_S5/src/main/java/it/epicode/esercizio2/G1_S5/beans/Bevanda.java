package it.epicode.esercizio2.G1_S5.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
@Scope("prototype")
public class Bevanda extends Prodotto {

	public Bevanda(double prezzo, String nome, int calorie) {
		super(prezzo, nome, calorie);
	}
	
}
