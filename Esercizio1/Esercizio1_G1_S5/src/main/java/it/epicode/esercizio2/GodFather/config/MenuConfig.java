package it.epicode.esercizio2.GodFather.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.epicode.esercizio2.GodFather.model.Menu;
import it.epicode.esercizio2.GodFather.model.ToppingCheese;
import it.epicode.esercizio2.GodFather.model.ToppingHam;
import it.epicode.esercizio2.GodFather.model.Drink;
import it.epicode.esercizio2.GodFather.model.DrinkLemonade;
import it.epicode.esercizio2.GodFather.model.Franchise;
import it.epicode.esercizio2.GodFather.model.FranchiseMug;
import it.epicode.esercizio2.GodFather.model.Pizza;
import it.epicode.esercizio2.GodFather.model.PizzaFamilySize;
import it.epicode.esercizio2.GodFather.model.PizzaHawaiian;
import it.epicode.esercizio2.GodFather.model.PizzaMargherita;
import it.epicode.esercizio2.GodFather.model.PizzaSalami;

@Configuration
public class MenuConfig {

	@Bean
	public Menu menu() {

		Menu menu = new Menu();

		menu.getMenuPizza().add(pizzaMargherita());
		menu.getMenuPizza().add(pizzaHawaiian());
		menu.getMenuPizza().add(pizzaSalami());

		menu.getMenuTopping().add(new ToppingCheese(null));
		menu.getMenuTopping().add(new ToppingHam(null));


		menu.getMenuDrink().add(drinkLemonade());
		
		

		return menu;

	}

	@Bean
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}

	@Bean
	public PizzaHawaiian pizzaHawaiian() {
		return new PizzaHawaiian();
	}

	@Bean
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}

	@Bean
	public Drink drinkLemonade() {
		return new DrinkLemonade();
	}
	
	@Bean
	public Franchise franchiseMug() {
		return new FranchiseMug();
	}
	
}
