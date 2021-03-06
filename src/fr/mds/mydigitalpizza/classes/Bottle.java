package fr.mds.mydigitalpizza.classes;

import fr.mds.mydigitalpizza.interfaces.Packing;

public class Bottle implements Packing {
	private String texture;
	private String name;
	
	public Bottle() {
		this.name = "bouteille";
		setTexture();
	}

	@Override
	public void setTexture() {
		this.texture = "verre";
	}
	
	public String toString() {
		return this.name+" en "+this.texture;
	}
}
