package fr.mds.mydigitalpizza.classes;

import fr.mds.mydigitalpizza.interfaces.Item;
import fr.mds.mydigitalpizza.interfaces.Packing;

public class ColdDrink implements Item {
	private String name;
	private Packing packing;
	private float price;
	
	public ColdDrink() {
		this.packing = new Bottle();
	}

	@Override
	public String setName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing setPacking() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float setPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
