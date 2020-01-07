package fr.mds.mydigitalpizza.classes;

import fr.mds.mydigitalpizza.interfaces.Item;
import fr.mds.mydigitalpizza.interfaces.Packing;

public class Burger  implements Item {
	private String name;
	private Packing packing;
	private float price;

	@Override
	public void setName(String na) {
		// TODO Auto-generated method stub
		this.name = na;
	}

	@Override
	public void setPacking(Packing pa) {
		// TODO Auto-generated method stub
		this.packing = pa;
	}

	@Override
	public void setPrice(float pr) {
		// TODO Auto-generated method stub
		this.price = pr;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return this.packing;
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return this.price;
	}
	
	public String toString() {
		return "Le burger "+this.name+" emballé avec "+this.packing+" coûte "+this.price+" euros.";
	}
}
