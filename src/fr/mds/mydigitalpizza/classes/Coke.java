package fr.mds.mydigitalpizza.classes;

public class Coke extends ColdDrink {
	private String name;
	private float price;
	
	public Coke() {
		this.name = "Coca cola";
		this.price = 2;
	}
	
	public String name() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return price;
	}
	
	public String toString() {
		return "Le "+this.name+" co�te "+this.price+" euros.";
	}
}
