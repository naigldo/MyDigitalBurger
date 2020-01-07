package fr.mds.mydigitalpizza.classes;

public class Pepsi extends ColdDrink {
	private String name;
	private float price;
	
	public Pepsi() {
		name = "Pepsi";
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
		return "Le "+this.name+" coûte "+this.price+" euros.";
	}
}
