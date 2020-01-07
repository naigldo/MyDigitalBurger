package fr.mds.mydigitalpizza.classes;

public class DrawGame extends Game {
	private String name;
	private float price;
	
	public DrawGame() {
		name = "dessin";
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
		return "Le jeu est un "+this.name;
	}
}
