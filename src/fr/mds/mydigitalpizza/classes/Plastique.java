package fr.mds.mydigitalpizza.classes;

import fr.mds.mydigitalpizza.interfaces.Packing;

public class Plastique implements Packing {
	private String texture;
	private String name;
	
	public Plastique() {
		this.name = "plastique";
		setTexture();
	}

	@Override
	public void setTexture() {
		this.texture = "plastique";
	}
	
	public String toString(){
		return this.name+" en "+this.texture;
	}
}
