package fr.mds.mydigitalpizza.classes;

public class ChickenBurger extends Burger {
	private String name;
	private float price;
	
	public ChickenBurger() {
		name = "Burger poulet";
		price = 7;
	}
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return this.price;
	}
	
	 public String toString() {
		return "Le "+name+" emball� avec un "+super.packing()+" et co�te "+price+" euros.";
	}
}
