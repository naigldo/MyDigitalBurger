package fr.mds.mydigitalpizza.builder;

import fr.mds.mydigitalpizza.classes.CarGame;
import fr.mds.mydigitalpizza.classes.ChickenBurger;
import fr.mds.mydigitalpizza.classes.Coke;
import fr.mds.mydigitalpizza.classes.Meal;
import fr.mds.mydigitalpizza.classes.MiniBurger;
import fr.mds.mydigitalpizza.classes.Pepsi;
import fr.mds.mydigitalpizza.classes.VegBurger;
import fr.mds.mydigitalpizza.interfaces.Item;
import fr.mds.mydigitalpizza.interfaces.Packing;

public class MealBuilder {
	protected String name;
    protected Packing packing;
    protected float price;
    
    private Meal meal = new Meal();

    public MealBuilder prepareVegMeal() {
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        
        return this;
    }
    
    public MealBuilder prepareNonVegMeal() {
    	meal.addItem(new ChickenBurger());
    	meal.addItem(new Pepsi());

        return this;
    }
    
    public MealBuilder prepareChildMeal() {
    	meal.addItem(new MiniBurger());
    	meal.addItem(new Coke());
    	meal.addItem(new CarGame());

        return this;
    }
    
    public MealBuilder addItem(Item item) {
    	meal.addItem(item);
    	return this;
    }
    
    public Meal build() {
    	return meal;
    }
}
