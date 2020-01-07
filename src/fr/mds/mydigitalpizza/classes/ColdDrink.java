package fr.mds.mydigitalpizza.classes;

import fr.mds.mydigitalpizza.interfaces.Item;
import fr.mds.mydigitalpizza.interfaces.Packing;

public abstract class ColdDrink implements Item {
	private Packing packing;
	
	public ColdDrink() {
		this.packing = new Bottle();
	}

	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return packing;
	}
}
