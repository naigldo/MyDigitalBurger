package fr.mds.mydigitalpizza.builder;

import fr.mds.mydigitalpizza.classes.ChickenBurger;
import fr.mds.mydigitalpizza.classes.Coke;
import fr.mds.mydigitalpizza.classes.Meal;
import fr.mds.mydigitalpizza.classes.Pepsi;
import fr.mds.mydigitalpizza.classes.VegBurger;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		
		//Menu non v�g�
		System.out.println("--- Menu non v�g� : ---");
		MealBuilder nonVegBuilder = new MealBuilder();
        Meal nonVegMeal = nonVegBuilder.prepareNonVegMeal().build();
        nonVegMeal = nonVegBuilder.addItem(new Pepsi()).build();
        nonVegMeal.showItems();
        System.out.println("Le menu non v�g� co�te "+nonVegMeal.getCost()+" euros.");
        System.out.println("-----------------------------------");
        
        //Menu v�g�
      	System.out.println("--- Menu v�g� : ---");
      	MealBuilder vegBuilder = new MealBuilder();
        Meal vegMeal = vegBuilder.prepareVegMeal().build();
        vegMeal = vegBuilder.addItem(new Coke()).build();
        vegMeal.showItems();
        System.out.println("Le menu v�g� co�te "+vegMeal.getCost()+" euros.");
        System.out.println("-----------------------------------");
        
        //Menu enfant
        System.out.println("--- Menu enfant : ---");
      	MealBuilder enfBuilder = new MealBuilder();
        Meal enfMeal = enfBuilder.prepareChildMeal().build();
        enfMeal.showItems();
        System.out.println("Le menu v�g� enfant "+enfMeal.getCost()+" euros.");
        System.out.println("-----------------------------------");
        
        //customMeal
      	System.out.println("--- Menu custom : ---");
      	MealBuilder customBuilder = new MealBuilder();
        Meal customMeal = customBuilder.addItem(new VegBurger()).build();
        customMeal = customBuilder.addItem(new ChickenBurger()).build();
        customMeal = customBuilder.addItem(new Pepsi()).build();
        customMeal.showItems();
        System.out.println("Le menu custom co�te "+customMeal.getCost()+" euros.");
        
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
