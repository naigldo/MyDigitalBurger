package fr.mds.mydigitalpizza.classes;

import fr.mds.mydigitalpizza.interfaces.Item;
import fr.mds.mydigitalpizza.interfaces.Packing;

public abstract class Burger  implements Item {
	private Packing packing;
	
	public Burger() {
		this.packing = new Wrapper();
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return this.packing;
	}
	
	public abstract String toString();
}
