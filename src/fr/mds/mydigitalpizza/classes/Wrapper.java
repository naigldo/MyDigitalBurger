package fr.mds.mydigitalpizza.classes;

import fr.mds.mydigitalpizza.interfaces.Packing;

public class Wrapper implements Packing {
	private String texture;
	private String name;
	
	public Wrapper() {
		this.name = "wrapper";
		setTexture();
	}

	@Override
	public void setTexture() {
		this.texture = "papier";
	}
	
	public String toString(){
		return this.name+" en "+this.texture;
	}
}
