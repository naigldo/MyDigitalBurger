package fr.mds.mydigitalpizza.classes;

public class CarGame extends Game{
	private String name;
	private float price;
	
	public CarGame() {
		name = "voiture";
		price = 0;
	}

	public String name() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return this.price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Le jeu est une "+this.name;
	}
}
