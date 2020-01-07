package fr.mds.mydigitalpizza.classes;

import fr.mds.mydigitalpizza.interfaces.Item;
import fr.mds.mydigitalpizza.interfaces.Packing;

public abstract class Game implements Item {
	private Packing packing;
	
	public Game() {
		this.packing = new Plastique();
	}
	
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return this.packing;
	}
	
	public abstract String toString();
}
