package fr.mds.mydigitalpizza.builder;

import fr.mds.mydigitalpizza.classes.Meal;
import fr.mds.mydigitalpizza.interfaces.Packing;

public class MealBuilder {
	protected String name;
    protected Packing packing;
    protected float price;
    public Pizza creerPizza() {
        return new Pizza();
    }

    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterIngredients();

    public Meal prepareVegMeal() {
        final Meal meal = new Meal();

        meal.setName(this.name);
        meal.setSauce(this.packing);
        meal.setIngredients(this.price);

        return meal;
    }
    
    public Meal prepareNonVegMeal() {
        final Meal meal = new Meal();

        meal.setPate(this.pate);
        meal.setSauce(this.sauce);
        meal.setIngredients(this.ingredients);

        return meal;
    }
}
