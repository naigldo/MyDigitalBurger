package fr.mds.mydigitalpizza.classes;

public class VegBurger extends Burger {
	private String name;
	private float price;
	
	public VegBurger() {
		this.name = "Burger végé";
		this.price = 6;
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
		return "Le "+name+" emballé avec un "+super.packing()+" et coûte "+price+" euros.";
	}
}
