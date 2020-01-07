package fr.mds.mydigitalpizza.builder;

import fr.mds.mydigitalpizza.classes.ChickenBurger;
import fr.mds.mydigitalpizza.classes.Coke;
import fr.mds.mydigitalpizza.classes.Meal;
import fr.mds.mydigitalpizza.classes.Pepsi;
import fr.mds.mydigitalpizza.classes.VegBurger;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		
		//Menu non végé
		System.out.println("--- Menu non végé : ---");
		MealBuilder nonVegBuilder = new MealBuilder();
        Meal nonVegMeal = nonVegBuilder.prepareNonVegMeal().build();
        nonVegMeal = nonVegBuilder.addItem(new Pepsi()).build();
        nonVegMeal.showItems();
        System.out.println("Le menu non végé coûte "+nonVegMeal.getCost()+" euros.");
        System.out.println("-----------------------------------");
        
        //Menu végé
      	System.out.println("--- Menu végé : ---");
      	MealBuilder vegBuilder = new MealBuilder();
        Meal vegMeal = vegBuilder.prepareVegMeal().build();
        vegMeal = vegBuilder.addItem(new Coke()).build();
        vegMeal.showItems();
        System.out.println("Le menu végé coûte "+vegMeal.getCost()+" euros.");
        System.out.println("-----------------------------------");
        
        //Menu enfant
        System.out.println("--- Menu enfant : ---");
      	MealBuilder enfBuilder = new MealBuilder();
        Meal enfMeal = enfBuilder.prepareChildMeal().build();
        enfMeal.showItems();
        System.out.println("Le menu végé enfant "+enfMeal.getCost()+" euros.");
        System.out.println("-----------------------------------");
        
        //customMeal
      	System.out.println("--- Menu custom : ---");
      	MealBuilder customBuilder = new MealBuilder();
        Meal customMeal = customBuilder.addItem(new VegBurger()).build();
        customMeal = customBuilder.addItem(new ChickenBurger()).build();
        customMeal = customBuilder.addItem(new Pepsi()).build();
        customMeal.showItems();
        System.out.println("Le menu custom coûte "+customMeal.getCost()+" euros.");
        
        /////// TESTS \\\\\\\
        /*Pepsi peps = new Pepsi();
        System.out.println(peps);
        
        VegBurger veg = new VegBurger();
        System.out.println(veg);
        
        Coke coke = new Coke();
        System.out.println(coke);
        
        ChickenBurger chick = new ChickenBurger();
        System.out.println(chick);*/
    }
}
